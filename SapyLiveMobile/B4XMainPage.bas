B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@

#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private Button1 As Button
	Private EditText1 As EditText
	Private EditText2 As EditText
	Dim rp As RuntimePermissions
	Dim p As Phone
	Public MainMenu As MainMenu
	Public GrvStockIn As GrvStockIn
	Public GrvHeaderInfo As GrvHeaderInfo
	Public GrvStockDetailLine As GrvStockDetailLine
	Public StockTransfer As StockTransfer
	Public DrawRawMaterial As DrawRawMaterial
	Public LinkDispatchPlanToStock1 As LinkDispatchPlanToStock
	Public DispatchPlanDetails As DispatchPlanDetails
	Public TruckSheets As TruckSheets
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	
	B4XPages.AddPage("MainMenu",MainMenu)
	MainMenu.Initialize
	
	
	B4XPages.AddPage("LinkDispatchPlanToStock",LinkDispatchPlanToStock1)
	LinkDispatchPlanToStock1.Initialize
	
	
	B4XPages.AddPage("GrvHeaderInfo",GrvHeaderInfo)
	GrvHeaderInfo.Initialize
	
	B4XPages.AddPage("GrvStockIn",GrvStockIn)
	GrvStockIn.Initialize
	
	
	B4XPages.AddPage("GrvStockDetailLine",GrvStockDetailLine)
	GrvStockDetailLine.Initialize
	
	B4XPages.AddPage("StockTransfer",StockTransfer)
	StockTransfer.Initialize
	
	B4XPages.AddPage("DrawRawMaterial",DrawRawMaterial)
	DrawRawMaterial.Initialize
	
	B4XPages.AddPage("DispatchPlanDetails",DispatchPlanDetails)
	DispatchPlanDetails.Initialize
	
	B4XPages.AddPage("TruckSheets",TruckSheets)
	TruckSheets.Initialize
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Button1_Click
	
	If p.SdkVersion >= 29 Then
		
		Main.IMENo =	p.getSettings("android_id")
		Else
		Main.IMENo =	p.getSettings("android_id")
	End If
	
	
	
	#If debug
	EditText1.Text = "james@webbis.co.za"
	EditText2.Text = "Tytyty@21"
	#End If
	
	GetToken(EditText1.Text,EditText2.Text)
End Sub


Private Sub EditText2_EnterPressed
	
End Sub

Private Sub EditText1_EnterPressed
	
End Sub



public Sub GetToken(UserName As String , Password As String )
	
	
	
	Dim j As HttpJob
	j.Initialize("", Me)
	
	Dim Map1 As Map
	Map1.Initialize
	Map1.Clear
	
	Map1.Put("userName",UserName)
	Map1.Put("password",Password)
	
	Dim JSON As JSONGenerator
	JSON.Initialize(Map1)
 
	Dim data As String =   JSON.ToPrettyString(1)
		
	
	
	
	Dim strserver As String =Main.server & "/api/Login"
	'/api/users/authenticate
	'http://41.203.1.50:20579/api/Login
	'http://41.203.1.5:20579/api/Login
	j.PostString(strserver,data )
	j.GetRequest.SetContentType("application/json")
	Wait For (j) JobDone(j As HttpJob)
	If j.Success Then
		Dim JSONx As JSONParser
		Dim Map1 As Map
		Log(j.GetString)
		JSONx.Initialize(j.GetString)
		Try
			
			Main.Token = j.GetString
		
		
		
			Main.UserLogin = UserName
		
			B4XPages.ShowPage("MainMenu")
		Catch
			Log(LastException)
		End Try
		
	Else
		
		ToastMessageShow("Unsuccessfuly Login",True)
		
	End If
		
		
	
	j.Release

	
	
End Sub