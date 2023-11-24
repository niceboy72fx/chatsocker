import React from "react";
import { Button, Result } from "antd";
export default function NotFound404() {
  return (
    <>
      <Result
        status="404"
        title="404 Not Found"
        subTitle="Sorry, the page you visited does not exist."
        extra={<Button type="default">Back Home</Button>}
      />
    </>
  );
}
