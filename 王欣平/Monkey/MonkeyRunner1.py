# Imports the monkeyrunner modules used by this program
    from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice

    # Connects to the current device, returning a MonkeyDevice object
    device = MonkeyRunner.waitForConnection(5,127.0.0.1:62001)

    # Installs the Android package. Notice that this method returns a boolean, so you can test
    # to see if the installation worked.
    device.installPackage('E:\JuniorSecond\Mobile_terminal_Automatic_testing\apk\caculator.apk')

    # sets a variable with the package's internal name
    package = 'com.orangestudio.calculator'

    # sets a variable with the name of an Activity in the package
    activity = 'com.orangestudio.calculator.ui.activity.SplashActivity'

    # sets the name of the component to start
    runComponent = package + '/' + activity

    # Runs the component
    device.startActivity(component=runComponent)

    # Presses the Menu button
    device.press('KEYCODE_MENU', MonkeyDevice.DOWN_AND_UP)

    # Takes a screenshot
    result = device.takeSnapshot()

    # Writes the screenshot to a file
    result.writeToFile('shot1.png','png')
    