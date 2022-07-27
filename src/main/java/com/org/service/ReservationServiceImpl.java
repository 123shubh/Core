package com.org.service;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.org.entiry.ReservationEntity;
import com.org.exception.ReservationAlreadyExist;
import com.org.repository.ReservationRepository;

/**
 * @author deshm
 */
@Service
public class ReservationServiceImpl implements IReservationService {

    static final Logger logger = LoggerFactory.getLogger(ReservationServiceImpl.class);

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public boolean checkIfHotelPresent(String hotelId) {
        /*
         * String hotelIdLocal = reservationRepository.findByHotelId(hotelId);
         * if(hotelIdLocal==null || hotelIdLocal.isEmpty()) { throw new
         * NotFoundException("Hotel Id not Found"); }
         */
        return true;
    }

    @Override
    public boolean checkIfRoomIdPresent(String roomId, String ratePlanId) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean checkIfRatePlanPresent(String hotelId, String ratePlanId) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean checkIfStartDateAndDateAreValid(LocalDate startDateOfReservation, LocalDate endDateOfReservation) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean checkForDuplicateReservation(int reservationId) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public ReservationEntity postReservation(ReservationEntity reservation) throws ReservationAlreadyExist {
        if (reservation.getResStatus().equalsIgnoreCase("Commit")) {

            if (reservationRepository.findById(reservation.getReservationId()) != null) {
                try {
                    reservationRepository.save(reservation);
                } catch (Exception e) {
                    logger.error("Error while posting reservation to database {} ", e.getMessage());
                }
            } else {
                logger.info("Reservation already exist");
                throw new ReservationAlreadyExist("Reservation already exist for resId :" + reservation.getReservationId(), reservation.getReservationId());
            }
        }
        return null;
    }

}
