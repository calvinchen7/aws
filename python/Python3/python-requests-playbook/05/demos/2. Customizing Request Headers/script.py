import requests

custom_headers = {
    "Authorization": "Bearer ACCESS_TOKEN",
    "Accept": "application/json",
}


response = requests.get("http://127.0.0.1:8000/api/items", headers=custom_headers)


print(response.request.headers)