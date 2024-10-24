package pl.rlnkooo.hotel_management.service.interfaces;

import pl.rlnkooo.hotel_management.dto.Response;
import pl.rlnkooo.hotel_management.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);
    Response findBookingByConfirmationCode(String confirmationCode);
    Response getAllBookings();
    Response cancelBooking(Long bookingId);
}
