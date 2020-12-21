public class Mouse implements UsbConnectable{
	@Override
	public void usbConnect(){//publicを取るとセキュリティ強くなる→overrideでは強くするとエラーになるので注意！
		System.out.println("USB接続にて操作ができます。");
	}
}
