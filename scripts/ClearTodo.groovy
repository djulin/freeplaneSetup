// @ExecutionModes({ON_SINGLE_NODE})
if (node.link) {
   if (!(node.icons.contains("unchecked") || node.icons.contains("yes"))) {
       c.setStatusInfo("ERROR: ClearTodo: node has a link but is not a Todo")
       return
   }
   todoNode = node.link.getNode()
   if (!(todoNode.icons.contains("unchecked") || todoNode.icons.contains("yes"))) {
       c.setStatusInfo("ERROR: ClearTodo: node has a link which is itself not a Todo")
       return
   }
   date = new Date()
   node.icons.add("checked")
   node.icons.remove("unchecked")
   node.icons.remove("yes")
   node.reminder.remove()
   node["actualDate"] = date
//   node.link.setText(null)
   todoNode.icons.add("checked")
   todoNode.icons.remove("unchecked")
   todoNode.icons.remove("yes")
   todoNode.reminder.remove()
   todoNode["actualDate"] = date
//   todoNode.link.setText(null)
   c.setStatusInfo("SUCCESS: ClearTodo")
} else {
   c.setStatusInfo("ERROR: ClearTodo: node has no link")
}


