import img from "../../page/auth/img/background_in_space.png";
export const Message: React.FC<{ reply: boolean; content: string }> = ({
  reply,
  content,
}) => {
  return (
    <>
      {reply ? (
        <div className="flex flex-row justify-start ">
          <img className="rounded-full w-11 h-11 m-3 mr-5" src={img} />
          <div className="shadow-2xl bg-green-600 mt-3 w-1/2 text-white p-4 rounded-lg">
            <p className=" ">{content}</p>
            <p className="float-right m-2">10:26pm</p>
          </div>
        </div>
      ) : (
        <div className="flex flex-row justify-end ">
          <div
            className="shadow-2xl  mt-3 w-1/2 p-4 text-white rounded-lg"
            style={{ backgroundColor: "#282A35" }}
          >
            <p className=" ">{content}</p>
            <p className="float-right m-2">10:26pm</p>
          </div>
          <img className="rounded-full w-11 h-11 m-3 ml-5" src={img} />
        </div>
      )}
    </>
  );
};

export const ListRecentContact: React.FC = () => {
  return <></>;
};
