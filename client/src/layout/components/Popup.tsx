import { CaretRightOutlined, CloseCircleOutlined } from "@ant-design/icons";
import { Collapse, CollapseProps } from "antd";

const UserPopup: React.FC = () => {
  const onChange = (key: string | string[]) => {
    console.log(key);
  };

  const text = `
  A dog is a type of domesticated animal.
  Known for its loyalty and faithfulness,
  it can be found as a welcome guest in many households across the world.
`;

  const items: CollapseProps["items"] = [
    {
      key: "1",
      label: "This is panel header 1",
      children: <p>{text}</p>,
    },
    {
      key: "2",
      label: "This is panel header 2",
      children: <p>{text}</p>,
    },
    {
      key: "3",
      label: "This is panel header 3",
      children: <p>{text}</p>,
    },
  ];
  return (
    <section
      className=" bg-white p-10 rounded-md shadow-2xl translate-y-1 transition-all ease-in-out  "
      style={{ maxHeight: "80vh" }}
    >
      <div className="infor-tag flex flex-col items-center ">
        <div className="infor-tag-frame  ">
          <div className="flex flex-row justify-between items-center">
            <h2 className="tag-frame-name text-xl uppercase font-semibold">
              My Infor
            </h2>
            <button className="tag-frame-name text-3xl uppercase font-semibold">
              <CloseCircleOutlined />
            </button>
          </div>
          <div className="tag-frame-board ">
            <div className="frame-board-intro grid  ">
              <div className="flex flex-col items-center ">
                <img
                  className="w-44 h-44 mb-3 rounded-full shadow-lg"
                  src=""
                  alt=""
                />
                <div className="frame-name-button text-2xl">Name</div>
              </div>
              <div
                className="overflow-scroll "
                style={{ width: "50vh", maxHeight: "25vh" }}
              >
                <Collapse
                  size="large"
                  bordered={false}
                  defaultActiveKey={["1"]}
                  expandIcon={({ isActive }) => (
                    <CaretRightOutlined rotate={isActive ? 90 : 0} />
                  )}
                  style={{ background: "white" }}
                  items={items}
                />
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
  );
};

const SettingPopup: React.FC = () => {
  const onChange = (key: string | string[]) => {
    console.log(key);
  };

  const text = `
  A dog is a type of domesticated animal.
  Known for its loyalty and faithfulness,
  it can be found as a welcome guest in many households across the world.
`;

  const items: CollapseProps["items"] = [
    {
      key: "1",
      label: "This is panel header 1",
      children: <p>{text}</p>,
    },
    {
      key: "2",
      label: "This is panel header 2",
      children: <p>{text}</p>,
    },
    {
      key: "3",
      label: "This is panel header 3",
      children: <p>{text}</p>,
    },
  ];
  return (
    <div className="bg-white  shadow-2xl rounded-md p-5 w-2/3">
      <div></div>
      <Collapse
        className=""
        size="middle"
        items={items}
        defaultActiveKey={["1"]}
        onChange={onChange}
      />
      ;
    </div>
  );
};

const PopupFrame: React.FC = () => {
  return (
    <section
      className="absolute w-full h-full  z-50 flex items-center justify-center "
      style={{ backgroundColor: "rgba(0,0,0,0.4)" }}
    >
      <UserPopup />
    </section>
  );
};

export default PopupFrame;
