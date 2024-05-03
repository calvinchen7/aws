import requests


# session = requests.Session()
with requests.Session() as session:
    credentials = {"username": "some_name", "password": "pass"}

    session.post("http://127.0.0.1:8000/api/login", data=credentials)

    # login_response = session.post("http://127.0.0.1:8000/api/login", data=credentials)

    # print("Cookies returned from login:")
    # print(session.cookies.get_dict())
    # print("Login response:")
    # print(login_response.text)

    response = session.get("http://127.0.0.1:8000/protected")

    print("Protected route:")
    print(response.status_code)
    print(response.text)