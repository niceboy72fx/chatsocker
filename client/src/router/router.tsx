import { createBrowserRouter } from "react-router-dom";
import FormAuth from "../page/auth/Auth";
import ForgotPassword, {
  EmailConfirm,
  EmailSent,
  ResetPassword,
} from "../page/forgot-password/ForgotPassword";
import NotFound404 from "../components/NotFound404";
import LayoutPage from "../layout/LayoutPage";

const PrivateRoute: any = [
  {
    path: "/t",
    element: <LayoutPage />,
  },
];

const Route = () => {
  return createBrowserRouter([
    ...PrivateRoute,
    {
      path: "/",
      element: <FormAuth />,
    },
    {
      path: "/forgot",
      element: <ForgotPassword />,
      children: [
        {
          path: "/forgot/forgot-password",
          element: <EmailConfirm />,
        },
        {
          path: "/forgot/email-sent",
          element: <EmailSent />,
        },
        {
          path: "/forgot/reset",
          element: <ResetPassword />,
        },
      ],
    },
    {
      path: "*",
      element: <NotFound404 />,
    },
  ]);
};

export default Route;
