OracleXML getXML -user "grp4/here4grp4" -conn "jdbc:oracle:thin:@sit.itec.yorku.ca:1521:studb10g" -rowsetTag "TICKETS" -rowTag "TICKET" "select t.ORDERID.PAYMENT.USERID.GENERATENAME() as cName, t.ORDERID.PAYMENT.USERID.USERID as usrID, to_char(t.ORDERID.PAYMENT.USERID.DOFB,'yyyy-mm-dd') as DOB, t.SEATID.SEATID as seatId, t.FLIGHTID.FLIGHTID as fID, t.FLIGHTID.ORIGIN.AIRPORTID as Origin, t.FLIGHTID.DESTINATION.AIRPORTID as Dest from ticket t"
OracleXML getXML -user "grp4/here4grp4" -conn "jdbc:oracle:thin:@sit.itec.yorku.ca:1521:studb10g" -rowsetTag "AIRPORTS" -rowTag "AIRPORT" "select a.AIRPORTID as aID, a.NAME as aName from AIRPORT a"