// @ExecutionModes({ON_SINGLE_NODE})
date = new Date()
sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
dateAsString = sdf.format(date)
node2 = node.createChild()
node2.text = "ROLLUP " + dateAsString + " --> "
node2.icons.add("narrative")
node2["rollup.start"] = date
node2["actualDate"] = date

