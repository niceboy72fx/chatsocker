import React, { useEffect, useRef, useState } from "react";
import {
  BarsOutlined,
  CommentOutlined,
  FileAddOutlined,
  FileImageOutlined,
  PhoneOutlined,
  SendOutlined,
  VideoCameraOutlined,
} from "@ant-design/icons";
import { Message } from "./Message";
import IntroImg from "../img/intro.gif";
import img from "../../page/auth/img/background_in_space.png";

export const Header: React.FC<{ headerContact: object }> = ({
  headerContact,
}) => {
  const sideBar = document.getElementById("drawer-navigation");
  return (
    <div className="chat-input w-full flex items-center justify-between shadow-lg z-20 bg-white">
      <div className="p-4 flex items-center">
        <img
          src={headerContact?.avatar}
          className="rounded-full w-11 h-11 mr-4 "
          alt={headerContact?.name}
        />
        <div className="flex flex-col">
          <p className="font-bold text-xl">{headerContact?.name}</p>
          <i className="text-xs">Online</i>
        </div>
      </div>
      <div className="p-4 flex items-center">
        <PhoneOutlined className="text-xl m-1 mr-7" />
        <VideoCameraOutlined className="text-xl m-1 mr-7" />
        <BarsOutlined
          className="text-xl m-1"
          onClick={() => {
            sideBar?.classList.remove(
              "transition-transform",
              "translate-x-full"
            );
          }}
        />
      </div>
    </div>
  );
};

export const FormChat: React.FC<{ item: object }> = ({ item }) => {
  const chatContainerRef = useRef<HTMLDivElement>(null);

  useEffect(() => {
    console.log(chatContainerRef?.current.scrollHeight);
    if (chatContainerRef?.current) {
      chatContainerRef.current.scrollTop =
        chatContainerRef.current.scrollHeight;
    }
    chatContainerRef?.current.scrollIntoView({
      block: "end",
      behavior: "smooth",
    });
  }, [item]);

  return (
    <div ref={chatContainerRef} className="overflow-y-scroll w-full">
      {item?.map((temp: any) => (
        <Message key={temp.id} reply={temp.reply} content={temp.content} />
      ))}
    </div>
  );
};

export const TabIntro: React.FC = () => {
  return (
    <div className="  w-full h-full " style={{}}>
      <div
        className="text-2xl text-green-600 flex flex-col items-center justify-center font-bold"
        style={{ height: "100vh" }}
      >
        <img src={IntroImg} alt="intro" />
        {/* <h2>Welcome, Name</h2>
        <h3>Please select a chat to Start messaging.</h3> */}
      </div>
    </div>
  );
};

export const ChatInput: React.FC<{ setInput: any }> = ({ setInput }) => {
  const [inputHandle, setInputHandle] = useState<string>("");

  return (
    <div className="relative bottom-0 chat-input w-full flex items-center shadow-2xl bg-white">
      <div className="p-4 flex items-center">
        <FileAddOutlined className="text-2xl m-3" />
        <FileImageOutlined className="text-2xl m-3" />
        <FileImageOutlined className="text-2xl m-3" />
      </div>
      <div className="relative w-full">
        <div className="absolute inset-y-0 left-0 flex items-center pl-3 pointer-events-none"></div>
        <input
          type="input"
          className="block w-full p-4 pl-10 text-sm text-gray-900 border border-gray-300 rounded-lg bg-gray-50 focus:ring-blue-500 focus:border-blue-500 dark:bg-white dark:border-gray-600 dark:placeholder-gray-400 dark:focus:ring-blue-500 dark:focus:border-blue-500"
          placeholder="Aa"
          required
          onChange={(e) => setInputHandle(e.target.value)}
        />
        <button
          onClick={() => setInput(inputHandle)}
          type="button"
          className="text-white absolute right-2.5 bottom-2.5 bg-green-500 hover:bg-green-600 focus:outline-none focus:ring-green-300 font-medium rounded-lg text-lg px-4 py-2 dark:bg-green-600 dark:hover:bg-green- dark:focus:ring-green-500 flex items-center"
        >
          <SendOutlined />
        </button>
      </div>
      <div className="p-4 flex items-center">
        <FileAddOutlined className="text-2xl m-3" />
      </div>
    </div>
  );
};

export const SideInfor: React.FC = () => {
  const sideBar = document.getElementById("drawer-navigation");
  return (
    <div
      id="drawer-navigation"
      className="fixed top-0 right-0 z-40 w-64 h-screen p-4 overflow-y-auto transition-transform translate-x-full bg-white "
      style={{ width: "60vh", backgroundColor: "#282A35" }}
      aria-labelledby="drawer-navigation-label"
    >
      <button
        type="button"
        data-drawer-hide="drawer-navigation"
        aria-controls="drawer-navigation"
        onClick={() => {
          sideBar?.classList.add("transition-transform", "translate-x-full");
        }}
        className="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg text-sm p-1.5 absolute top-2.5 right-2.5 inline-flex items-center dark:hover:bg-gray-600 dark:hover:text-white"
      >
        <svg
          aria-hidden="true"
          className="w-5 h-5"
          fill="currentColor"
          viewBox="0 0 20 20"
          xmlns="http://www.w3.org/2000/svg"
        >
          <path
            fillRule="evenodd"
            d="M4.293 4.293a1 1 0 011.414 0L10 8.586l4.293-4.293a1 1 0 111.414 1.414L11.414 10l4.293 4.293a1 1 0 01-1.414 1.414L10 11.414l-4.293 4.293a1 1 0 01-1.414-1.414L8.586 10 4.293 5.707a1 1 0 010-1.414z"
            clipRule="evenodd"
          ></path>
        </svg>
        <span className="sr-only">Close menu</span>
      </button>
      <div className="py-4 overflow-y-auto">
        <ul className="space-y-2 font-medium">
          <li>
            <a
              href="#"
              className="flex items-center p-2 text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700 group"
            >
              <svg
                className="w-5 h-5 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white"
                aria-hidden="true"
                xmlns="http://www.w3.org/2000/svg"
                fill="currentColor"
                viewBox="0 0 22 21"
              >
                <path d="M16.975 11H10V4.025a1 1 0 0 0-1.066-.998 8.5 8.5 0 1 0 9.039 9.039.999.999 0 0 0-1-1.066h.002Z" />
                <path d="M12.5 0c-.157 0-.311.01-.565.027A1 1 0 0 0 11 1.02V10h8.975a1 1 0 0 0 1-.935c.013-.188.028-.374.028-.565A8.51 8.51 0 0 0 12.5 0Z" />
              </svg>
              <span className="ml-3">Dashboard</span>
            </a>
          </li>
        </ul>
      </div>
    </div>
  );
};

const Chat: React.FC<{ getContact: any }> = ({ getContact }) => {
  const [content, setContent] = useState<string>("");
  const [keyForFormChat, setKeyForFormChat] = useState<number>(
    getContact?.contentChat?.length
  );

  useEffect(() => {
    getContact?.contentChat.push({
      id: keyForFormChat,
      content: content,
      reply: false,
      type: 0,
      timestamp: "10:28pm",
      replyMess: 3,
    });
    setKeyForFormChat(getContact?.contentChat?.length + 1);
  }, [content]);

  return (
    <div className="h-full w-full bg-white">
      {getContact !== null ? (
        <div className="grid grid-rows-[auto,1fr,auto] h-screen w-full">
          <Header
            headerContact={{
              name: getContact?.name,
              avatar: getContact?.avatar,
            }}
          />
          <FormChat item={getContact?.contentChat} />
          <ChatInput setInput={setContent} />
          <SideInfor />
        </div>
      ) : (
        <TabIntro />
      )}
    </div>
  );
};

export default Chat;
