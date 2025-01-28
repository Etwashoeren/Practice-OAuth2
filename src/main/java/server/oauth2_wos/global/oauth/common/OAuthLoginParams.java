package server.oauth2_wos.global.oauth.common;

import org.springframework.util.MultiValueMap;

public interface OAuthLoginParams { // OAuth 요청을 위한 파라미터 값들을 갖고 있는 인터페이스
    OAuthProvider oAuthProvider();
    MultiValueMap<String, String> makeBody();
}
