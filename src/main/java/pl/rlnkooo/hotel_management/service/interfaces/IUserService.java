package pl.rlnkooo.hotel_management.service.interfaces;

import pl.rlnkooo.hotel_management.dto.LoginRequest;
import pl.rlnkooo.hotel_management.dto.Response;
import pl.rlnkooo.hotel_management.entity.User;

public interface IUserService {

    Response register(User user);
    Response login(LoginRequest loginRequest);
    Response getAllUsers();
    Response getUserBookingHistory(String userId);
    Response deleteUser(String userId);
    Response getUserById(String userId);
    Response getMyInfo(String email);
}
