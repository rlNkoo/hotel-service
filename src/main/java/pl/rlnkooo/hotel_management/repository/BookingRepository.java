package pl.rlnkooo.hotel_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlnkooo.hotel_management.entity.Booking;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByRoomId(Long roomId);

    List<Booking> findByBookingConfirmationCode(String confirmationCode);

    List<Booking> findByUserId(Long userId);
}
