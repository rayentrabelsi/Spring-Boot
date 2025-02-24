package tn.esprit.tpfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.repository.ReservationRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService{
    @Autowired
    ReservationRepository ReservationRepository;
    public List<Reservation> retrieveAllReservations() {
        return ReservationRepository.findAll();
    }
    public Reservation retrieveReservation(String reservationId) {
        return ReservationRepository.findById(reservationId).get();
    }
    public Reservation addReservation(Reservation r) {
        return ReservationRepository.save(r);
    }
    public void removeReservation(String reservationId) {
        ReservationRepository.deleteById(reservationId);
    }
    public Reservation modifyReservation(Reservation reservation) {
        return ReservationRepository.save(reservation);

    }
}
