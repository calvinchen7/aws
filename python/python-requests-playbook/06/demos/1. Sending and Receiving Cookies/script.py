import requests

custom_cookies = {"user_id": "2"}

response = requests.get("http://127.0.0.1:8000/api/cookies", cookies=custom_cookies)


print(response.cookies.get_dict())
print(response.cookies["user_id"])