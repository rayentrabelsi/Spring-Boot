package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.repository.EtudiantRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService{
    @Autowired
    EtudiantRepository EtudiantRepository;
    public List<Etudiant> retrieveAllEtudiants() {
        return EtudiantRepository.findAll();
    }
    public Etudiant retrieveEtudiant(Long etudiantId) {
        return EtudiantRepository.findById(etudiantId).get();
    }
    public Etudiant addEtudiant(Etudiant e) {
        return EtudiantRepository.save(e);
    }
    public void removeEtudiant(Long etudiantId) {
        EtudiantRepository.deleteById(etudiantId);
    }
    public Etudiant modifyEtudiant(Etudiant etudiant) {
        return EtudiantRepository.save(etudiant);

    }
}
