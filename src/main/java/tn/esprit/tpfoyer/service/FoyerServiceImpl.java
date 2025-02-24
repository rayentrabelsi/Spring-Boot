package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.repository.FoyerRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService{
    @Autowired
    FoyerRepository FoyerRepository;
    public List<Foyer> retrieveAllFoyers() {
        return FoyerRepository.findAll();
    }
    public Foyer retrieveFoyer(Long foyerId) {
        return FoyerRepository.findById(foyerId).get();
    }
    public Foyer addFoyer(Foyer f) {
        return FoyerRepository.save(f);
    }
    public void removeFoyer(Long foyerId) {
        FoyerRepository.deleteById(foyerId);
    }
    public Foyer modifyFoyer(Foyer foyer) {
        return FoyerRepository.save(foyer);

    }
}
