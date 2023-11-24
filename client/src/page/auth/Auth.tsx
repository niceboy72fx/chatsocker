import React, { useRef } from "react";
import "./auth.scss";
import { Tabs } from "antd";
import { Button } from "flowbite-react";
// import { useDispatch, useSelector } from "react-redux";
import { useNavigate, useParams } from "react-router";

const FormAuth: React.FC = () => {
  const { pathAuth } = useParams<string>();
  // RouterConfig();
  let auth: string = "1";
  if (pathAuth === "login") {
    auth = "1";
  } else if (pathAuth === "register") {
    auth = "2";
  }
  return (
    <section className="auth ">
      <div className="auth-panel shadow-2xl rounded-xl ">
        <Tabs
          className="m-10"
          defaultActiveKey={auth}
          tabBarStyle={{
            display: "flex",
            justifyContent: "space-between",
          }}
          items={[
            {
              label: "LogIn",
              key: "1",
              children: <Login />,
            },

            {
              label: "SignUp",
              key: "2",
              children: <SignUp />,
            },
          ]}
        />
      </div>
    </section>
  );
};

const FormBox: React.FC<{ name: any }> = ({ name }) => {
  const navigate = useNavigate();
  const nameUser = useRef<HTMLDivElement | string>(null);
  const email = useRef<HTMLDivElement | string>(null);
  const password = useRef<HTMLDivElement | string>(null);
  const rePass = useRef<HTMLDivElement | string>(null);
  // const dispatch = useDispatch();
  const buttonSubmit = (event) => {
    event.preventDefault();

    if (name == "LogIn") {
      const data: any = {
        email: email.current?.value,
        password: password.current?.value,
      };
      // dispatch(logIn(data));
      if (localStorage.getItem("login") == "true") {
        navigate("/");
      }
    } else {
      if (password.current?.value === rePass.current?.value) {
        const data: any = {
          name: nameUser.current?.value,
          email: email.current?.value,
          password: password.current?.value,
          password_confirmation: rePass.current?.value,
        };
        // dispatch(register(data));
        if (localStorage.getItem("login") == "true") {
          navigate("/");
        }
      }
    }
  };

  return (
    <div className="">
      +
      <form className="flex flex-col gap-4 w-full ">
        <h1 className="font-bold mb-2 " style={{ fontSize: "1.5rem" }}>
          {name}
        </h1>
        {name == "LogIn" ? (
          <></>
        ) : (
          <div>
            <div className="mb-5 block ">
              <h3 className="font-bold">Your Name</h3>
            </div>
            <div className="intro-search-input m-2  flex flex-row items-center outline outline-1  h-full bg-white  rounded-3xl ">
              <input
                className="outline-none border-none ml-2 mr-2  hover:not-italic font-bold w-96 h-11"
                type="search"
                ref={nameUser}
                style={{ backgroundColor: "white" }}
                placeholder="Your Name "
              />
            </div>
          </div>
        )}
        <div>
          <div className="mb-5  block">
            <h3 className="font-bold">Your Email</h3>
          </div>
          <div className="intro-search-input m-2  flex flex-row items-center outline outline-1  h-full bg-white  rounded-3xl ">
            <input
              className="outline-none border-none ml-2 mr-2  hover:not-italic font-bold w-96 h-11"
              type="email"
              ref={email}
              style={{ backgroundColor: "white" }}
              placeholder="example@example.com"
            />
          </div>
        </div>
        <div>
          <div className="mb-5 block">
            <h3 className="font-bold">Your Password</h3>
          </div>
          <div className="intro-search-input m-2  flex flex-row items-center outline outline-1  h-full bg-white  rounded-3xl ">
            <input
              className="outline-none border-none ml-2 mr-2  hover:not-italic font-bold w-96 h-11 sm:w-60"
              type="password"
              ref={password}
              style={{ backgroundColor: "white" }}
              placeholder="Your password !"
            />
          </div>
        </div>
        {name == "LogIn" ? (
          <button
            className="m-1"
            onClick={() => navigate("/forgot/forgot-password")}
          >
            Forget your password?
          </button>
        ) : (
          <div>
            <div className="mb-5 block">
              <h3 className="font-bold">Re-type password</h3>
            </div>
            <div className="intro-search-input m-2  flex flex-row items-center outline outline-1  h-full bg-white  rounded-3xl ">
              <input
                className="outline-none border-none ml-2 mr-2  hover:not-italic font-bold w-96 h-11"
                type="search"
                ref={rePass}
                style={{ backgroundColor: "white" }}
                placeholder="Re-type password !"
              />
            </div>
          </div>
        )}
        <Button
          type="submit"
          color="success"
          className="bg-green-600 m-5 ml-10 mr-10 text-2xl p-2 rounded-3xl font-bold text-white"
          onClick={(event) => buttonSubmit(event)}
        >
          {name}
        </Button>
      </form>
    </div>
  );
};

const Login: React.FC = () => {
  return (
    <>
      <FormBox name="LogIn" />
      <Oauth />
    </>
  );
};
const SignUp: React.FC = () => {
  return (
    <>
      <FormBox name="Register" />
      <Oauth />
    </>
  );
};

const Oauth: React.FC = () => {
  return (
    <>
      <div className="flex items-center justify-center">
        <button className="rounded-full border-solid border-2  ">
          <svg
            className="w-6 h-6 dark:text-green-600 m-3"
            aria-hidden="true"
            xmlns="http://www.w3.org/2000/svg"
            fill="currentColor"
            viewBox="0 0 18 19"
          >
            <path
              fill-rule="evenodd"
              d="M8.842 18.083a8.8 8.8 0 0 1-8.65-8.948 8.841 8.841 0 0 1 8.8-8.652h.153a8.464 8.464 0 0 1 5.7 2.257l-2.193 2.038A5.27 5.27 0 0 0 9.09 3.4a5.882 5.882 0 0 0-.2 11.76h.124a5.091 5.091 0 0 0 5.248-4.057L14.3 11H9V8h8.34c.066.543.095 1.09.088 1.636-.086 5.053-3.463 8.449-8.4 8.449l-.186-.002Z"
              clip-rule="evenodd"
            />
          </svg>
        </button>
        <p className="m-7">or</p>
        <button className="rounded-full border-solid border-2  ">
          <svg
            className="w-6 h-6 dark:text-green-600 m-3"
            aria-hidden="true"
            xmlns="http://www.w3.org/2000/svg"
            fill="currentColor"
            viewBox="0 0 8 19"
          >
            <path
              fill-rule="evenodd"
              d="M6.135 3H8V0H6.135a4.147 4.147 0 0 0-4.142 4.142V6H0v3h2v9.938h3V9h2.021l.592-3H5V3.591A.6.6 0 0 1 5.592 3h.543Z"
              clip-rule="evenodd"
            />
          </svg>
        </button>
      </div>
    </>
  );
};

export default FormAuth;
