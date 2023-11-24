import { RouterProvider } from "react-router-dom";
import Route from "./router/router";

function App() {
  const route = Route();
  return (
    <>
      <RouterProvider router={route} />
    </>
  );
}

export default App;
