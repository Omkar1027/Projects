import 'package:flutter/material.dart';
import 'package:dash_chat_2/dash_chat_2.dart';
class BotScreen extends Statefulwidget {
const BotScreen({super.key});
@override
State<BotScreen> createState() =>_BotScreenState();
}
class_BotScreenState extends State<BotScreen> {
//users
ChatUser myself = ChatUser(id: '1', firstName: 'Deva');
ChatUser gemini = ChatUser(id: '2', firstName: 'Gemini');
List<ChatMessage> messages = <ChatMessage>[];

@override
Widget build(BuildContext context) {
return Scaffold(
appBar: AppBar(
title: Text(
'Talk',
style: Textstyle(fontweight: FontWeight.bold, color: Colors.white),
// Text
backgroundColor: Colors.blue,
centerTitle: true,
), //
AppBar
body: DashChat(
currentUser: myself, onSend: (ChatMessage m) {}, messages: messages,), // DashChat
);
// Scaffold
}
}
Widget yourAvatarBuilder(
ChatUser user, Function? onAvatarTap, Function? onAvatar LongPress) {
return Center(
child: Image.asset
'assets/g.png',
height: 40,
width: 40,
// Image.asset
); // Center
}