package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.repository.UniversiteRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService{
    @Autowired
    UniversiteRepository UniversiteRepository;
    public List<Universite> retrieveAllUniversites() {
        return UniversiteRepository.findAll();
    }
    public Universite retrieveUniversite(Long universiteId) {
        return UniversiteRepository.findById(universiteId).get();
    }
    public Universite addUniversite(Universite u) {
        return UniversiteRepository.save(u);
    }
    public void removeUniversite(Long universiteId) {
        UniversiteRepository.deleteById(universiteId);
    }
    public Universite modifyUniversite(Universite universite) {
        return UniversiteRepository.save(universite);

    }
}
