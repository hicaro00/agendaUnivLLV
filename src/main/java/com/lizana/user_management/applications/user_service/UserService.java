package com.lizana.user_management.applications.user_service;

import com.lizana.user_management.applications.user_dtos.UserDtoLoginRequest;
import com.lizana.user_management.applications.user_dtos.UserDtoRegistryRequest;
import com.lizana.user_management.applications.user_dtos.UserProfileDtoResponse;
import reactor.core.publisher.Mono;

public interface UserService {

  Mono <String> userRegistryService(UserDtoRegistryRequest userDtoRegistryRequest);

  Mono<String> userLoginService(UserDtoLoginRequest userDtoLoginRequest);

  Mono<UserProfileDtoResponse> getProfileService(String userId);

  Mono<String> userUpdateProfile(UserDtoRegistryRequest userDtoRegistryRequest);
}
