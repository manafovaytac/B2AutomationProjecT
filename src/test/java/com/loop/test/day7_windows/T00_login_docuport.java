package com.loop.test.day7_windows;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportUtilies;
import com.loop.test.utilities.DocuportsConstants;
import org.testng.annotations.Test;

public class T00_login_docuport extends TestBase {

    @Test
    public  void  test_login_docuport() throws InterruptedException {
        DocuportUtilies.login(driver, DocuportsConstants.CLIENT);

        DocuportUtilies.logOut(driver);
    }
}
