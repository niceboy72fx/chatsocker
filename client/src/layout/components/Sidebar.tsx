import { CommentOutlined } from "@ant-design/icons";
import img from "../../mock/content/avatar/1.jpg";
import "../style.scss";
import { useAppContext } from "../LayoutPage";
const Sidebar: React.FC<{ contact: Array<object>; setContact: any }> = ({
  contact,
  setContact,
}) => {
  return (
    <aside
      id="default-sidebar"
      className=" top-0 left-0 z-40  h-screen transition-transform -translate-x-full sm:translate-x-0 "
      style={{ width: "50vh" }}
      aria-label="Sidebar"
    >
      <div
        className="h-full  w-full px-3 py-4 overflow-y-auto bg-gray-50  "
        style={{ backgroundColor: "#282A35" }}
      >
        <div
          className="fixed top-0 left-0 w-full "
          style={{ backgroundColor: "#282A35" }}
        >
          <div className="text-2xl text-white flex items-center justify-center font-bold mb-5 m-5">
            <CommentOutlined style={{ fontSize: "30px" }} />
            <p className="m-2">Chat Socker</p>
          </div>
          <div className="relative mr-3 ml-3">
            <div className="absolute inset-y-0 left-0 flex items-center pl-3 pointer-events-none">
              <svg
                className="w-4 h-4 text-gray-500 dark:text-gray-400"
                aria-hidden="true"
                xmlns="http://www.w3.org/2000/svg"
                fill="none"
                viewBox="0 0 20 20"
              >
                <path
                  stroke="currentColor"
                  stroke-linecap="round"
                  stroke-linejoin="round"
                  stroke-width="2"
                  d="m19 19-4-4m0-7A7 7 0 1 1 1 8a7 7 0 0 1 14 0Z"
                />
              </svg>
            </div>
            <input
              type="search"
              id="default-search"
              className="block w-full p-2 pl-10 text-sm text-gray-900 border border-gray-300 rounded-lg bg-gray-50 focus:ring-blue-500 focus:border-blue-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
              placeholder="Search Mockups, Logos..."
              required
            />
          </div>
        </div>
        <ul className="w-full font-medium mt-32 scroll">
          {contact.map((item: any) => (
            <li>
              <button
                className="text-gray-400 bg-transparent hover:bg-gray-200 hover:text-gray-900 rounded-lg p-1.5 w-full dark:hover:bg-gray-600 dark:hover:text-white"
                onClick={() => {
                  setContact(item);
                }}
              >
                <div className="p-4 flex items-center ">
                  <img
                    src={item.avatar}
                    className="rounded-full w-11 h-11 mr-4 "
                  />
                  <div className="flex flex-col w-full  items-center max-w-96 overflow-x-hidden">
                    <div className="flex justify-between items-center w-full">
                      <p className="font-bold text-xl text-white">
                        {item.name}
                      </p>
                      <p className="text-xs text-white">Online</p>
                    </div>
                    <div className="flex justify-between items-center w-full">
                      <div
                        className="text-xs text-white mt-3 justify-start w-56 overflow-hidden "
                        style={{
                          textOverflow: "ellipsis",
                          whiteSpace: "nowrap",
                        }}
                      >
                        It looks like you are defining a React functional
                        component named Message. The component appears to take a
                        prop named type with the type of string. However,
                        there's a slight issue in your prop type declaration.
                        The prop type should be wrapped in curly braces . Here's
                        the corrected version:
                      </div>
                    </div>
                  </div>
                </div>
              </button>
            </li>
          ))}
        </ul>
      </div>
    </aside>
  );
};

export default Sidebar;
