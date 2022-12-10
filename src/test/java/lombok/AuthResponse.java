package lombok;


import io.qameta.allure.internal.shadowed.jackson.annotation.JsonIgnoreProperties;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthResponse {
    private String error;
    private String token;
}
