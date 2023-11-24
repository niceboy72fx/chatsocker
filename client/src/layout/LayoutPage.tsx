import Sider from "antd/es/layout/Sider";
import Chat from "./components/Chat";
import Sidebar from "./components/Sidebar";
import { Avatar, Layout, Menu, Space } from "antd";
import { useEffect, useRef, useState } from "react";
import {
  InsertRowLeftOutlined,
  LoginOutlined,
  SettingOutlined,
  UserOutlined,
} from "@ant-design/icons";
import { MockData } from "../mock/mockData";
import PopupFrame from "./components/Popup";

const LayoutPage: React.FC = () => {
  const [collapsed, setCollapsed] = useState<any>(true);
  const { name, avatar, infor, email, contact } = MockData;
  const [getContact, setContact] = useState<object>(null);
  const [dropDownMenu, showDropDownMenu] = useState<boolean>(false);
  const [popup, showPopup] = useState<boolean>(false);
  const dropDownAction = useRef<HTMLDivElement>(null);
  useEffect(() => {
    if (dropDownMenu) {
      dropDownAction?.current?.classList.remove(
        "opacity-0",
        "translate-y-1",
        "transition-all",
        "duration-300",
        "ease-in-out"
      );
      dropDownAction?.current?.classList.add(
        "block",
        "opacity-100",
        "translate-y-0",
        "transition-all",
        "duration-300",
        "ease-in-out"
      );
    } else {
      dropDownAction?.current?.classList.remove(
        "block",
        "opacity-100",
        "translate-y-0",
        "transition-all",
        "duration-300",
        "ease-in-out"
      );
      dropDownAction?.current?.classList.add("opacity-0", "translate-y-1");
    }
  }, [dropDownMenu]);

  document
    ?.getElementsByClassName("site-layout")[0]
    ?.addEventListener("click", () => {
      showDropDownMenu(false);
    });

  return (
    <section className="flex items-center justify-center relative">
      <Layout hasSider className="flex items-center justify-center ">
        <Sider
          style={{
            overflow: "auto",
            height: "100vh",
            left: 0,
            top: 0,
            bottom: 0,
            backgroundColor: "black",
          }}
          collapsed={collapsed}
        >
          <Menu theme="dark" mode="inline" className="flex items-center">
            <Menu.Item
              style={{
                transition: "all 0.2s",
                backgroundColor: "black",
                display: "flex",
                alignItems: "center",
                height: "7vh",
              }}
              icon={
                <Space
                  direction="vertical"
                  align="center"
                  onClick={() =>
                    dropDownMenu
                      ? showDropDownMenu(false)
                      : showDropDownMenu(true)
                  }
                >
                  <Avatar
                    style={{ backgroundColor: "gray" }}
                    icon={<UserOutlined />}
                    size={50}
                  />
                </Space>
              }
            >
              {name}
            </Menu.Item>
          </Menu>

          <Menu theme="dark" mode="inline" className="bottom-0">
            <Menu.Item
              style={{
                position: "absolute",
                bottom: 0,
                zIndex: 1,
                transition: "all 0.2s",
                backgroundColor: "green",
              }}
              icon={<InsertRowLeftOutlined />}
              onClick={() =>
                collapsed ? setCollapsed(false) : setCollapsed(true)
              }
            >
              Collapsed
            </Menu.Item>
          </Menu>
        </Sider>
        <div
          ref={dropDownAction}
          className="absolute opacity-0 translate-y-1 transition-all ease-in-out duration-300  bg-white top-0 left-16 m-5 z-50 rounded-md  text-md"
        >
          <ul
            className="  w-full text-gray-700 dark:text-gray-400"
            aria-labelledby="dropdownLargeButton"
          >
            <li className="flex flex-row block px-4 py-2 hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">
              <UserOutlined />
              <p className="ml-2"> Your Account</p>
            </li>
            <li className="flex flex-row block px-4 py-2  hover:bg-gray-100 dark:hover:bg-gray-600 dark:hover:text-white">
              <SettingOutlined />
              <p className="ml-2">Setting</p>
            </li>
          </ul>
          <div className="flex flex-row  block px-4 py-2 text-gray-700 hover:bg-gray-100 dark:hover:bg-gray-600 dark:text-gray-400 dark:hover:text-white">
            <LoginOutlined />
            <p className="ml-2">Log out</p>
          </div>
        </div>
        <Layout className="site-layout">
          <div className="flex  justify-between ">
            {" "}
            <Sidebar contact={contact} setContact={setContact} />
            <Chat getContact={getContact} />
          </div>
        </Layout>
      </Layout>
      <PopupFrame />
    </section>
  );
};

export default LayoutPage;
