// @ExecutionModes({ON_SINGLE_NODE})
todoAttribute = "todo.branch"
if (node.link) {
   if (!(node.icons.contains("unchecked") || node.icons.contains("yes"))) {
       c.setStatusInfo("ERROR: MakeTodo: node has a link but is not a Todo")
       return
   }
   todoNode = node.link.getNode()
   if (!(todoNode.icons.contains("unchecked") || todoNode.icons.contains("yes"))) {
       c.setStatusInfo("ERROR: MakeTodo: node has a link which is itself not a Todo")
       return
   }
} else {
   def todoBranch
   todoBranchId = node.map.root[todoAttribute]
   if (! todoBranchId) {
      todoBranch = node.map.root.createChild()
      todoBranch.text = "TODO"
      todoBranch.icons.add("checked")
      todoBranch.icons.add("unchecked")
      todoBranch.icons.add("checked")
      node.map.root[todoAttribute] = todoBranch.getId()
   } else {
      todoBranch = node.map.node(todoBranchId.to.string)
   }
   todoNode = todoBranch.createChild(0)
   todoNode.text = node.text
   todoNode.icons.add("unchecked")
   todoNode.link.setNode(node)
   node.icons.add("yes")
   node.icons.remove("checked")
   node.link.setNode(todoNode)
}
if (node.reminder) {
   node.link.getNode().reminder.createOrReplace(node.reminder.getRemindAt(),node.reminder.getPeriodUnit(),node.reminder.getPeriod())
   c.setStatusInfo("SUCCESS: MakeTodo: reminder=" + node.reminder)
} else {
   node.link.getNode().reminder.remove()
   c.setStatusInfo("SUCCESS: MakeTodo: no reminder")
}

