import requests

response = requests.get("http://127.0.0.1:8000/something")
print(response.status_code)

if response:
    print("Success!")

if response.status_code == 200:
    print("Success!")
elif response.status_code == 500:
    print("Server error.")
elif response.status_code == 404:
    print("Page not Found.")