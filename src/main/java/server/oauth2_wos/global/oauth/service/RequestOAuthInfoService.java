package server.oauth2_wos.global.oauth.service;

import org.springframework.stereotype.Component;
import server.oauth2_wos.global.oauth.common.OAuthProvider;
import server.oauth2_wos.global.oauth.common.OAuthClient;
import server.oauth2_wos.global.oauth.common.OAuthInfoResponse;
import server.oauth2_wos.global.oauth.common.OAuthLoginParams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class RequestOAuthInfoService {
    private final Map<OAuthProvider, OAuthClient> clients;

    public RequestOAuthInfoService(List<OAuthClient> clients) {
        this.clients = clients.stream().collect(
                Collectors.toUnmodifiableMap(OAuthClient::oAuthProvider, Function.identity())
        );
    }

    public OAuthInfoResponse request(OAuthLoginParams params) {
        OAuthClient client = clients.get(params.oAuthProvider());
        String accessToken = client.requestAccessToken(params);

        return client.requestOauthInfo(accessToken);
    }
}
