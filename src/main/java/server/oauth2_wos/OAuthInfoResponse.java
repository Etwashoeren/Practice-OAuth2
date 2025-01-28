package server.oauth2_wos;

public interface OAuthInfoResponse { // Access Token 으로 요청한 외부 API 프로필 응답값을 서비스의 Model 로 변환시키기 위한 인터페이스
    String getEmail();
    String getNickname();
    OAuthProvider getOAuthProvider();
}
