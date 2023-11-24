import React, { useRef } from "react";
import "./ForgotPassword.scss";
import { Button } from "antd";
import { Outlet } from "react-router";

const ForgotPassword = () => {
  return (
    <section className="forgot flex justify-center items-center">
      <Outlet />
      {/* <ResetPassword /> */}
    </section>
  );
};

export const EmailConfirm = () => {
  const emailName = useRef<HTMLDivElement | string>(null);
  const reset = () => {
    // console.log(emailName.current?.value);
  };

  return (
    <div className="forgot-form shadow-2xl">
      <form className="flex flex-col gap-4 w-full">
        <div>
          <div className="mb-5  block">
            <h3 className="font-bold">Please type your email</h3>
          </div>
          <div className="intro-search-input m-2  flex flex-row items-center outline outline-1  h-full bg-white  rounded-3xl ">
            <input
              className="outline-none border-none ml-2 mr-2  hover:not-italic font-bold w-96 h-11"
              type="search"
              ref={emailName}
              style={{ backgroundColor: "white" }}
              placeholder="example@example.com"
            />
            <div className="frame-name-button mr-10">
              <button className="name-button-browse hide" onClick={reset()}>
                Forgot password !
              </button>
            </div>
          </div>
          <button className="name-button-browse hiden" onClick={reset()}>
            Forgot password !
          </button>
        </div>
      </form>
    </div>
  );
};

export const ResetPassword = () => {
  return (
    <div className="forgot-form shadow-2xl">
      <form className="flex flex-col gap-4 w-full">
        <div>
          <div>
            <div className="mt-8 mb-8">
              <div className="mb-5  block">
                <h3 className="font-bold">Please type your new password!</h3>
              </div>
              <div className="intro-search-input mt-2 mb-2  flex flex-row items-center outline outline-1  h-full bg-white  rounded-3xl ">
                <input
                  className="outline-none border-none ml-2 mr-2  hover:not-italic font-bold w-96 h-11"
                  type="search"
                  style={{ backgroundColor: "white" }}
                  placeholder="example@example.com"
                />
              </div>
            </div>
            <div className="mt-8 mb-8">
              <div className="mb-5  block">
                <h3 className="font-bold">Re-type your new password !l</h3>
              </div>
              <div className="intro-search-input mt-2 mb-2  flex flex-row items-center outline outline-1  h-full bg-white  rounded-3xl ">
                <input
                  className="outline-none border-none ml-2 mr-2  hover:not-italic font-bold w-96 h-11"
                  type="search"
                  style={{ backgroundColor: "white" }}
                  placeholder="your password !"
                />
              </div>
            </div>
          </div>
          <div className="frame-name-button flex justify-center">
            <button className="name-button-browse ">Reset password !</button>
          </div>
        </div>
      </form>
    </div>
  );
};

export const EmailSent = () => {
  return (
    <div className="forgot-form shadow-2xl">
      <form className="flex flex-col gap-4 w-full">
        <div>
          <div className="mb-5  block">
            <h3 className="font-bold text-2xl text-center mb-8">
              Your Email was sent !
            </h3>
            <p>Please check your mailbox and got link to reset password !</p>
          </div>
          <div className="frame-name-button mr-10 flex justify-center">
            <button className="name-button-browse ">Back to Login !</button>
          </div>
        </div>
      </form>
    </div>
  );
};

export default ForgotPassword;
