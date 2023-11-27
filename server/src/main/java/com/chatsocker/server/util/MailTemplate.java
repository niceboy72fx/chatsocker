package com.chatsocker.server.util;

import org.springframework.stereotype.Component;

@Component
public class MailTemplate implements UtilFunction {
    public String templateIOtpMail(String code , String name) {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <title>Cake 2</title>\n" +
                "    <link rel=\"shortcut icon\" href=\"favicon.ico\" />\n" +
                "    <style type=\"text/css\">\n" +
                "      table[name=\"blk_permission\"],\n" +
                "      table[name=\"blk_footer\"] {\n" +
                "        display: none;\n" +
                "      }\n" +
                "    </style>\n" +
                "    <meta name=\"googlebot\" content=\"noindex\" />\n" +
                "    <meta name=\"ROBOTS\" content=\"NOINDEX, NOFOLLOW\" />\n" +
                "    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\n" +
                "  </head>\n" +
                "  <body\n" +
                "    marginheight=\"0\"\n" +
                "    marginwidth=\"0\"\n" +
                "    topmargin=\"0\"\n" +
                "    leftmargin=\"0\"\n" +
                "    style=\"\n" +
                "      height: 100% !important;\n" +
                "      margin: 0;\n" +
                "      padding: 0;\n" +
                "      width: 100% !important;\n" +
                "      min-width: 100%;\n" +
                "      background-color: #282a35;\n" +
                "    \"\n" +
                "  >\n" +
                "    <table\n" +
                "      name=\"bmeMainBody\"\n" +
                "      style=\"background-color: #282a35;\"\n" +
                "      width=\"100%\"\n" +
                "      cellspacing=\"0\"\n" +
                "      cellpadding=\"0\"\n" +
                "      border=\"0\"\n" +
                "      bgcolor=\"#34495e\"\n" +
                "    >\n" +
                "      <tbody>\n" +
                "        <tr>\n" +
                "          <td width=\"100%\" valign=\"top\" align=\"center\">\n" +
                "            <table\n" +
                "              name=\"bmeMainColumnParentTable\"\n" +
                "              width=\"100%\"\n" +
                "              cellspacing=\"0\"\n" +
                "              cellpadding=\"0\"\n" +
                "              border=\"0\"\n" +
                "            >\n" +
                "              <tbody>\n" +
                "                <tr>\n" +
                "                  <td\n" +
                "                    name=\"bmeMainColumnParent\"\n" +
                "                    style=\"\n" +
                "                      border: 0px none transparent;\n" +
                "                      border-radius: 0px;\n" +
                "                      border-collapse: separate;\n" +
                "                      border-spacing: 0px;\n" +
                "                    \"\n" +
                "                  >\n" +
                "                    <table\n" +
                "                      name=\"bmeMainColumn\"\n" +
                "                      class=\"\"\n" +
                "                      style=\"max-width: 100%;\"\n" +
                "                      width=\"100%\"\n" +
                "                      cellspacing=\"0\"\n" +
                "                      cellpadding=\"0\"\n" +
                "                      border=\"0\"\n" +
                "                      align=\"center\"\n" +
                "                    >\n" +
                "                      <tbody>\n" +
                "                        <tr>\n" +
                "                          <td\n" +
                "                            class=\"blk_container bmeHolder\"\n" +
                "                            name=\"bmePreHeader\"\n" +
                "                            style=\"\n" +
                "                              color: rgb(102, 102, 102);\n" +
                "                              border: 0px none transparent;\n" +
                "                            \"\n" +
                "                            width=\"100%\"\n" +
                "                            valign=\"top\"\n" +
                "                            bgcolor=\"\"\n" +
                "                            align=\"center\"\n" +
                "                          >\n" +
                "                            <div id=\"dv_2\" class=\"blk_wrapper\">\n" +
                "                              <table\n" +
                "                                class=\"blk\"\n" +
                "                                name=\"blk_permission\"\n" +
                "                                style=\"\"\n" +
                "                                width=\"600\"\n" +
                "                                cellspacing=\"0\"\n" +
                "                                cellpadding=\"0\"\n" +
                "                                border=\"0\"\n" +
                "                              >\n" +
                "                                <tbody>\n" +
                "                                  <tr>\n" +
                "                                    <td\n" +
                "                                      name=\"tblCell\"\n" +
                "                                      style=\"padding: 20px;\"\n" +
                "                                      valign=\"top\"\n" +
                "                                      align=\"left\"\n" +
                "                                    >\n" +
                "                                      <table\n" +
                "                                        width=\"100%\"\n" +
                "                                        cellspacing=\"0\"\n" +
                "                                        cellpadding=\"0\"\n" +
                "                                        border=\"0\"\n" +
                "                                      ></table>\n" +
                "                                    </td>\n" +
                "                                  </tr>\n" +
                "                                </tbody>\n" +
                "                              </table>\n" +
                "                            </div>\n" +
                "                          </td>\n" +
                "                        </tr>\n" +
                "                        <tr>\n" +
                "                          <td\n" +
                "                            class=\"bmeHolder\"\n" +
                "                            name=\"bmeMainContentParent\"\n" +
                "                            style=\"\n" +
                "                              border: 0px none transparent;\n" +
                "                              border-radius: 0px;\n" +
                "                              border-collapse: separate;\n" +
                "                              border-spacing: 0px;\n" +
                "                              overflow: hidden;\n" +
                "                            \"\n" +
                "                            width=\"100%\"\n" +
                "                            valign=\"top\"\n" +
                "                            align=\"center\"\n" +
                "                          >\n" +
                "                            <table\n" +
                "                              name=\"bmeMainContent\"\n" +
                "                              style=\"\n" +
                "                                border-radius: 0px;\n" +
                "                                border-collapse: separate;\n" +
                "                                border-spacing: 0px;\n" +
                "                                border: 0px none transparent;\n" +
                "                              \"\n" +
                "                              width=\"100%\"\n" +
                "                              cellspacing=\"0\"\n" +
                "                              cellpadding=\"0\"\n" +
                "                              border=\"0\"\n" +
                "                              align=\"center\"\n" +
                "                            >\n" +
                "                              <tbody>\n" +
                "                                <tr>\n" +
                "                                  <td\n" +
                "                                    class=\"blk_container bmeHolder\"\n" +
                "                                    name=\"bmeHeader\"\n" +
                "                                    style=\"\n" +
                "                                      color: rgb(56, 56, 56);\n" +
                "                                      border: 0px none transparent;\n" +
                "                                      background-color: #282a35;\n" +
                "                                    \"\n" +
                "                                    width=\"100%\"\n" +
                "                                    valign=\"top\"\n" +
                "                                    bgcolor=\"#34495e\"\n" +
                "                                    align=\"center\"\n" +
                "                                  >\n" +
                "                                    <div id=\"dv_9\" class=\"blk_wrapper\">\n" +
                "                                      <table\n" +
                "                                        class=\"blk\"\n" +
                "                                        name=\"blk_image\"\n" +
                "                                        width=\"600\"\n" +
                "                                        cellspacing=\"0\"\n" +
                "                                        cellpadding=\"0\"\n" +
                "                                        border=\"0\"\n" +
                "                                      >\n" +
                "                                        <tbody>\n" +
                "                                          <tr>\n" +
                "                                            <td>\n" +
                "                                              <table\n" +
                "                                                width=\"100%\"\n" +
                "                                                cellspacing=\"0\"\n" +
                "                                                cellpadding=\"0\"\n" +
                "                                                border=\"0\"\n" +
                "                                              >\n" +
                "                                                <tbody>\n" +
                "                                                  <tr>\n" +
                "                                                    <td\n" +
                "                                                      class=\"bmeImage\"\n" +
                "                                                      style=\"\n" +
                "                                                        border-collapse: collapse;\n" +
                "                                                        padding: 20px;\n" +
                "                                                      \"\n" +
                "                                                      align=\"center\"\n" +
                "                                                    >\n" +
                "                                                      <img\n" +
                "                                                        src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOqYQFJbuDi6KFqm93PhYqN-hN0xbiivJqJW1Jqv6N9hXpAtcPXM59Z7dz-2L4Q63YxYI&usqp=CAU\"\n" +
                "                                                        style=\"\n" +
                "                                                          max-width: 374px;\n" +
                "                                                          display: block;\n" +
                "                                                          width: 374px;\n" +
                "                                                        \"\n" +
                "                                                        alt=\"\"\n" +
                "                                                        width=\"374\"\n" +
                "                                                        border=\"0\"\n" +
                "                                                      />\n" +
                "                                                    </td>\n" +
                "                                                  </tr>\n" +
                "                                                </tbody>\n" +
                "                                              </table>\n" +
                "                                            </td>\n" +
                "                                          </tr>\n" +
                "                                        </tbody>\n" +
                "                                      </table>\n" +
                "                                    </div>\n" +
                "                                    <div id=\"dv_15\" class=\"blk_wrapper\">\n" +
                "                                      <table\n" +
                "                                        class=\"blk\"\n" +
                "                                        name=\"blk_text\"\n" +
                "                                        width=\"600\"\n" +
                "                                        cellspacing=\"0\"\n" +
                "                                        cellpadding=\"0\"\n" +
                "                                        border=\"0\"\n" +
                "                                      >\n" +
                "                                        <tbody>\n" +
                "                                          <tr>\n" +
                "                                            <td>\n" +
                "                                              <table\n" +
                "                                                class=\"bmeContainerRow\"\n" +
                "                                                width=\"100%\"\n" +
                "                                                cellspacing=\"0\"\n" +
                "                                                cellpadding=\"0\"\n" +
                "                                                border=\"0\"\n" +
                "                                              >\n" +
                "                                                <tbody>\n" +
                "                                                  <tr>\n" +
                "                                                    <td\n" +
                "                                                      class=\"tdPart\"\n" +
                "                                                      valign=\"top\"\n" +
                "                                                      align=\"center\"\n" +
                "                                                    >\n" +
                "                                                      <table\n" +
                "                                                        name=\"tblText\"\n" +
                "                                                        style=\"\n" +
                "                                                          float: left;\n" +
                "                                                          background-color: #282a35;\n" +
                "                                                        \"\n" +
                "                                                        width=\"600\"\n" +
                "                                                        cellspacing=\"0\"\n" +
                "                                                        cellpadding=\"0\"\n" +
                "                                                        border=\"0\"\n" +
                "                                                        align=\"left\"\n" +
                "                                                      >\n" +
                "                                                        <tbody>\n" +
                "                                                          <tr>\n" +
                "                                                            <td\n" +
                "                                                              name=\"tblCell\"\n" +
                "                                                              style=\"\n" +
                "                                                                padding: 20px;\n" +
                "                                                                font-family: Arial,\n" +
                "                                                                  Helvetica,\n" +
                "                                                                  sans-serif;\n" +
                "                                                                font-size: 14px;\n" +
                "                                                                font-weight: normal;\n" +
                "                                                                color: rgb(\n" +
                "                                                                  56,\n" +
                "                                                                  56,\n" +
                "                                                                  56\n" +
                "                                                                );\n" +
                "                                                                text-align: left;\n" +
                "                                                              \"\n" +
                "                                                              valign=\"top\"\n" +
                "                                                              align=\"left\"\n" +
                "                                                            >\n" +
                "                                                              <div\n" +
                "                                                                style=\"\n" +
                "                                                                  line-height: 125%;\n" +
                "                                                                  text-align: center;\n" +
                "                                                                \"\n" +
                "                                                              >\n" +
                "                                                                <span\n" +
                "                                                                  style=\"\n" +
                "                                                                    font-size: 60px;\n" +
                "                                                                    font-family: 'Courier New',\n" +
                "                                                                      Courier;\n" +
                "                                                                    color: #ffffff;\n" +
                "                                                                    line-height: 125%;\n" +
                "                                                                  \"\n" +
                "                                                                  ><strong\n" +
                "                                                                    >Hi\n" +
                name +
                "                                                                    </strong\n" +
                "                                                                  ></span\n" +
                "                                                                >\n" +
                "                                                              </div>\n" +
                "                                                            </td>\n" +
                "                                                          </tr>\n" +
                "                                                        </tbody>\n" +
                "                                                      </table>\n" +
                "                                                    </td>\n" +
                "                                                  </tr>\n" +
                "                                                </tbody>\n" +
                "                                              </table>\n" +
                "                                            </td>\n" +
                "                                          </tr>\n" +
                "                                        </tbody>\n" +
                "                                      </table>\n" +
                "                                    </div>\n" +
                "                                  </td>\n" +
                "                                </tr>\n" +
                "                                <tr>\n" +
                "                                  <td\n" +
                "                                    class=\"blk_container bmeHolder\"\n" +
                "                                    name=\"bmeBody\"\n" +
                "                                    style=\"\n" +
                "                                      color: rgb(56, 56, 56);\n" +
                "                                      border: 0px none transparent;\n" +
                "                                      background-color: #282a35;\n" +
                "                                    \"\n" +
                "                                    width=\"100%\"\n" +
                "                                    valign=\"top\"\n" +
                "                                    bgcolor=\"#34495e\"\n" +
                "                                    align=\"center\"\n" +
                "                                  >\n" +
                "                                    <div id=\"dv_11\" class=\"blk_wrapper\">\n" +
                "                                      <table\n" +
                "                                        class=\"blk\"\n" +
                "                                        name=\"blk_text\"\n" +
                "                                        width=\"600\"\n" +
                "                                        cellspacing=\"0\"\n" +
                "                                        cellpadding=\"0\"\n" +
                "                                        border=\"0\"\n" +
                "                                      >\n" +
                "                                        <tbody>\n" +
                "                                          <tr>\n" +
                "                                            <td>\n" +
                "                                              <table\n" +
                "                                                class=\"bmeContainerRow\"\n" +
                "                                                width=\"100%\"\n" +
                "                                                cellspacing=\"0\"\n" +
                "                                                cellpadding=\"0\"\n" +
                "                                                border=\"0\"\n" +
                "                                              >\n" +
                "                                                <tbody>\n" +
                "                                                  <tr>\n" +
                "                                                    <td\n" +
                "                                                      class=\"tdPart\"\n" +
                "                                                      valign=\"top\"\n" +
                "                                                      align=\"center\"\n" +
                "                                                    >\n" +
                "                                                      <table\n" +
                "                                                        name=\"tblText\"\n" +
                "                                                        style=\"\n" +
                "                                                          float: left;\n" +
                "                                                          background-color: transparent;\n" +
                "                                                        \"\n" +
                "                                                        width=\"600\"\n" +
                "                                                        cellspacing=\"0\"\n" +
                "                                                        cellpadding=\"0\"\n" +
                "                                                        border=\"0\"\n" +
                "                                                        align=\"left\"\n" +
                "                                                      >\n" +
                "                                                        <tbody>\n" +
                "                                                          <tr>\n" +
                "                                                            <td\n" +
                "                                                              name=\"tblCell\"\n" +
                "                                                              style=\"\n" +
                "                                                                padding: 20px;\n" +
                "                                                                font-family: Arial,\n" +
                "                                                                  Helvetica,\n" +
                "                                                                  sans-serif;\n" +
                "                                                                font-size: 14px;\n" +
                "                                                                font-weight: normal;\n" +
                "                                                                color: rgb(\n" +
                "                                                                  56,\n" +
                "                                                                  56,\n" +
                "                                                                  56\n" +
                "                                                                );\n" +
                "                                                                text-align: left;\n" +
                "                                                              \"\n" +
                "                                                              valign=\"top\"\n" +
                "                                                              align=\"left\"\n" +
                "                                                            >\n" +
                "                                                              <div\n" +
                "                                                                style=\"\n" +
                "                                                                  line-height: 200%;\n" +
                "                                                                \"\n" +
                "                                                              >\n" +
                "                                                                <span\n" +
                "                                                                  style=\"\n" +
                "                                                                    font-size: 14px;\n" +
                "                                                                    font-family: 'Courier New',\n" +
                "                                                                      Courier;\n" +
                "                                                                    color: #ffffff;\n" +
                "                                                                    line-height: 200%;\n" +
                "                                                                  \"\n" +
                "                                                                >\n" +
                "                                                                  We received\n" +
                "                                                                  your request\n" +
                "                                                                  for a\n" +
                "                                                                  single-use\n" +
                "                                                                  code to\n" +
                "                                                                  ChatSocker's\n" +
                "                                                                  account.</span\n" +
                "                                                                >\n" +
                "                                                                <br />\n" +
                "                                                                <span\n" +
                "                                                                  style=\"\n" +
                "                                                                    font-size: 14px;\n" +
                "                                                                    font-family: 'Courier New',\n" +
                "                                                                      Courier;\n" +
                "                                                                    color: #ffffff;\n" +
                "                                                                    line-height: 200%;\n" +
                "                                                                  \"\n" +
                "                                                                >\n" +
                "                                                                  Your\n" +
                "                                                                  single-use\n" +
                "                                                                  code is:</span\n" +
                "                                                                >\n" +
                "                                                              </div>\n" +
                "                                                            </td>\n" +
                "                                                          </tr>\n" +
                "                                                        </tbody>\n" +
                "                                                      </table>\n" +
                "                                                    </td>\n" +
                "                                                  </tr>\n" +
                "                                                </tbody>\n" +
                "                                              </table>\n" +
                "                                            </td>\n" +
                "                                          </tr>\n" +
                "                                        </tbody>\n" +
                "                                      </table>\n" +
                "                                    </div>\n" +
                "                                    <div id=\"dv_13\" class=\"blk_wrapper\">\n" +
                "                                      <table\n" +
                "                                        class=\"blk\"\n" +
                "                                        name=\"blk_divider\"\n" +
                "                                        style=\"\"\n" +
                "                                        width=\"600\"\n" +
                "                                        cellspacing=\"0\"\n" +
                "                                        cellpadding=\"0\"\n" +
                "                                        border=\"0\"\n" +
                "                                      >\n" +
                "                                        <tbody>\n" +
                "                                          <tr>\n" +
                "                                            <td\n" +
                "                                              class=\"tblCellMain\"\n" +
                "                                              style=\"padding: 10px 0px;\"\n" +
                "                                            >\n" +
                "                                              <table\n" +
                "                                                class=\"tblLine\"\n" +
                "                                                style=\"\n" +
                "                                                  border-top-width: 0px;\n" +
                "                                                  border-top-style: none;\n" +
                "                                                  min-width: 1px;\n" +
                "                                                \"\n" +
                "                                                width=\"100%\"\n" +
                "                                                cellspacing=\"0\"\n" +
                "                                                cellpadding=\"0\"\n" +
                "                                                border=\"0\"\n" +
                "                                              ></table>\n" +
                "                                            </td>\n" +
                "                                          </tr>\n" +
                "                                        </tbody>\n" +
                "                                      </table>\n" +
                "                                    </div>\n" +
                "                                    <div id=\"dv_12\" class=\"blk_wrapper\">\n" +
                "                                      <table\n" +
                "                                        class=\"blk\"\n" +
                "                                        name=\"blk_button\"\n" +
                "                                        style=\"\"\n" +
                "                                        width=\"600\"\n" +
                "                                        cellspacing=\"0\"\n" +
                "                                        cellpadding=\"0\"\n" +
                "                                        border=\"0\"\n" +
                "                                      >\n" +
                "                                        <tbody>\n" +
                "                                          <tr>\n" +
                "                                            <td width=\"20\"></td>\n" +
                "                                            <td align=\"center\">\n" +
                "                                              <table\n" +
                "                                                class=\"tblContainer\"\n" +
                "                                                width=\"100%\"\n" +
                "                                                cellspacing=\"0\"\n" +
                "                                                cellpadding=\"0\"\n" +
                "                                                border=\"0\"\n" +
                "                                              >\n" +
                "                                                <tbody>\n" +
                "                                                  <tr>\n" +
                "                                                    <td align=\"center\">\n" +
                "                                                      <table\n" +
                "                                                        class=\"bmeButton\"\n" +
                "                                                        style=\"\n" +
                "                                                          border-collapse: separate;\n" +
                "                                                        \"\n" +
                "                                                        cellspacing=\"0\"\n" +
                "                                                        cellpadding=\"0\"\n" +
                "                                                        border=\"0\"\n" +
                "                                                        align=\"center\"\n" +
                "                                                      >\n" +
                "                                                        <tbody>\n" +
                "                                                          <tr>\n" +
                "                                                            <td\n" +
                "                                                              style=\"\n" +
                "                                                                border-radius: 5px;\n" +
                "                                                                border: 3px\n" +
                "                                                                  solid\n" +
                "                                                                  rgb(\n" +
                "                                                                    255,\n" +
                "                                                                    255,\n" +
                "                                                                    255\n" +
                "                                                                  );\n" +
                "                                                                text-align: center;\n" +
                "                                                                font-family: Arial,\n" +
                "                                                                  Helvetica,\n" +
                "                                                                  sans-serif;\n" +
                "                                                                font-size: 14px;\n" +
                "                                                                padding: 20px\n" +
                "                                                                  40px;\n" +
                "                                                                font-weight: bold;\n" +
                "                                                                border-collapse: separate;\n" +
                "                                                              \"\n" +
                "                                                              class=\"bmeButtonText\"\n" +
                "                                                            >\n" +
                "                                                              <span\n" +
                "                                                                style=\"\n" +
                "                                                                  font-family: 'Courier New',\n" +
                "                                                                    Courier;\n" +
                "                                                                  font-size: 20px;\n" +
                "                                                                  color: rgb(\n" +
                "                                                                    255,\n" +
                "                                                                    255,\n" +
                "                                                                    255\n" +
                "                                                                  );\n" +
                "                                                                \"\n" +
                "                                                                ><a\n" +
                "                                                                  style=\"\n" +
                "                                                                    color: #ffffff;\n" +
                "                                                                    text-decoration: none;\n" +
                "                                                                  \"\n" +
                "                                                                  target=\"_blank\"\n" +
                "                                                                  > \n" + code +
                "                                                                  </a\n" +
                "                                                                ></span\n" +
                "                                                              >\n" +
                "                                                            </td>\n" +
                "                                                          </tr>\n" +
                "                                                        </tbody>\n" +
                "                                                      </table>\n" +
                "                                                    </td>\n" +
                "                                                  </tr>\n" +
                "                                                  <tr>\n" +
                "                                                    <td height=\"20\"></td>\n" +
                "                                                  </tr>\n" +
                "                                                </tbody>\n" +
                "                                              </table>\n" +
                "                                            </td>\n" +
                "                                            <td width=\"20\"></td>\n" +
                "                                          </tr>\n" +
                "                                        </tbody>\n" +
                "                                      </table>\n" +
                "                                    </div>\n" +
                "                                  </td>\n" +
                "                                </tr>\n" +
                "                              </tbody>\n" +
                "                            </table>\n" +
                "                          </td>\n" +
                "                        </tr>\n" +
                "\n" +
                "                        <tr>\n" +
                "                          <td\n" +
                "                            class=\"blk_container bmeHolder\"\n" +
                "                            name=\"bmeFooter\"\n" +
                "                            style=\"\n" +
                "                              color: rgb(102, 102, 102);\n" +
                "                              border: 0px none transparent;\n" +
                "                              background-color: #282a35;\n" +
                "                            \"\n" +
                "                            width=\"100%\"\n" +
                "                            valign=\"top\"\n" +
                "                            bgcolor=\"#34495e\"\n" +
                "                            align=\"center\"\n" +
                "                          >\n" +
                "                            <div id=\"dv_10\" class=\"blk_wrapper\">\n" +
                "                              <table\n" +
                "                                class=\"blk\"\n" +
                "                                name=\"blk_footer\"\n" +
                "                                style=\"\"\n" +
                "                                width=\"600\"\n" +
                "                                cellspacing=\"0\"\n" +
                "                                cellpadding=\"0\"\n" +
                "                                border=\"0\"\n" +
                "                              ></table>\n" +
                "                            </div>\n" +
                "                            <span\n" +
                "                              style=\"\n" +
                "                                font-size: 14px;\n" +
                "                                font-family: 'Courier New', Courier;\n" +
                "                                color: #ffffff;\n" +
                "                                line-height: 200%;\n" +
                "                                width: 60px;\n" +
                "                              \"\n" +
                "                            >\n" +
                "                              If you didn't request this code, you can safely\n" +
                "                              ignore this email.<br />\n" +
                "                              Someone else might have typed your email address\n" +
                "                              by mistake.</span\n" +
                "                            >\n" +
                "                          </td>\n" +
                "                        </tr>\n" +
                "                      </tbody>\n" +
                "                    </table>\n" +
                "                  </td>\n" +
                "                </tr>\n" +
                "              </tbody>\n" +
                "            </table>\n" +
                "          </td>\n" +
                "        </tr>\n" +
                "      </tbody>\n" +
                "    </table>\n" +
                "  </body>\n" +
                "</html>\n" +
                "<img\n" +
                "  src=\"http://benchmarkemail.benchurl.com/c/o?e=8E4B52&c=91CEA&t=1&l=7889F345&email=hL2iimIGZvj2QooSzVze1t7P%2FZjRPRKrj2c0%2B7DqUhU%3D&relid=\"\n" +
                "  alt=\"\"\n" +
                "  border=\"0\"\n" +
                "  style=\"display: none;\"\n" +
                "  height=\"1\"\n" +
                "  width=\"1\"\n" +
                "/>\n";
    };
}
