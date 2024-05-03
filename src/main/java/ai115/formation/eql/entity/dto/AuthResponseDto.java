package ai115.formation.eql.entity.dto;


    public class AuthResponseDto {

        private String accessToken;
        private String tokenType = "Bearer";
        public AuthResponseDto(String accessToken) {
            this.accessToken = accessToken;
        }


        /// Getters
        public String getAccessToken() {return accessToken;}
        public String getTokenType() {return tokenType;}

        /// Setters
        public void setAccessToken(String accessToken) {this.accessToken = accessToken;}
        public void setTokenType(String tokenType) {this.tokenType = tokenType;}
    }


