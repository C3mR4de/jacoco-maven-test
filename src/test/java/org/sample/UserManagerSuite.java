package org.sample;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({UserManager.class})
class UserManagerSuite
{
}