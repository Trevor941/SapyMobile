B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=9.85
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Public rp As RuntimePermissions
	Public SQLDB As SQL
	Public Shared As String
	Public UploadingTracking As Boolean = False
	Dim p As Phone

End Sub

Sub Service_Create
	'This is the program entry point.
	'This is a good place to load resources that are not specific to a single activity.

End Sub

Sub Service_Start (StartingIntent As Intent)
	Service.StopAutomaticForeground 'Starter service can start in the foreground state in some edge cases.
	Shared = rp.GetSafeDirDefaultExternal("")
	Dim scommand As String
	InitDB
	
End Sub

Sub Service_TaskRemoved
	'This event will be raised when the user removes the app from the recent apps list.
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy

End Sub
Public Sub InitDB
	If SQLDB.IsInitialized = False Then SQLDB.Initialize(Shared, "SapyLiveSystem.db",True)
	
	If p.SdkVersion >= 26 Then
		Dim r As Reflector
		r.Target = SQLDB
		r.Target = r.GetField("db")
		r.RunMethod("disableWriteAheadLogging")
	End If
End Sub
