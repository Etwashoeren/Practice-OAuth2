package server.oauth2_wos.global.oauth.common;

public interface OAuthClient { // OAuth 요쳥을 위한 클래스
    OAuthProvider oAuthProvider(); // Client의 타입 반환
    String requestAccessToken(OAuthLoginParams params); // AccessToken을 획득
    OAuthInfoResponse requestOauthInfo(String accessToken); // AccessToken을 기반으로 프로필 정보 획득
}
