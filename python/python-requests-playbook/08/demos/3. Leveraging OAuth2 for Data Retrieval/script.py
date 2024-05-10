from requests_oauthlib import OAuth2Session
import json

client_id = "your_client_id"
redirect_uri = "https://127.0.0.1:8000/callback"
authorization_base_url = "https://accounts.google.com/o/oauth2/auth"
token_url = "https://oauth2.googleapis.com/token"
scope = ["https://www.googleapis.com/auth/calendar"]

oauth = OAuth2Session(client_id, redirect_uri=redirect_uri, scope=scope)

authorization_url, state = oauth.authorization_url(
    authorization_base_url, prompt="consent"
)

print("Please go here and authorize access:", authorization_url)

redirect_response = input("Paste the full redirect URL here: ")

token = oauth.fetch_token(
    token_url,
    authorization_response=redirect_response,
    client_secret="your_client_secret",
)

response = oauth.get("https://www.googleapis.com/calendar/v3/users/me/calendarList")
data = response.json()

filename = "data.json"
with open(filename, "w") as file:
    json.dump(data, file, indent=4)