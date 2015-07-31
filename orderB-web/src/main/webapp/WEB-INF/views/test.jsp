<html>
<head>
<style type="text/css">
li {
	text-align: center;
	color: red;
	font-style: italic
}

#userTable {
	width: 100%;
	text-align: left;
    //border: 1px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 15px;
}
</style>
<script src="resources/js/jquery-1.11.2.js"></script>
<script src="resources/js/script.js"></script>

</head>
<body>

  <div align="left" style="margin-top: 40px;" id="registerDiv">
    <fieldset style="width: 40%">
      <legend style="font-size: medium;">
        <h3>Register</h3>
      </legend>
      <div align="Center">
        Country : <select><option value="India" id="country">India</option></select> Phone Number : <input type="text" id="phoneNo">
      </div>
      <br />
      <div align="right">
        <input type="submit" value="Register" id="register" style="font-size: medium; width: 100px; height: 30px;"> <input type="reset" value="Clear" id="clearRegistration">
      </div>
    </fieldset>
  </div>


  <div align="left" style="margin-top: 40px;" id="confirmDiv">
    <fieldset style="width: 40%">
      <legend style="font-size: medium;">
        <h3>Confirm</h3>
      </legend>
      <div align="left">
        Phone Number : <input type="text" id="confirmPhoneNo"> One Time Pin : <input type="text" id="otp"><br /> GCM ID : <input type="text" id="gcmId">
      </div>
      <br />
      <div align="right">
        <input type="submit" value="Confirm" id="confirm" style="font-size: medium; width: 100px; height: 30px;"> <input type="reset" value="Clear" id="clearConfirm">
      </div>
    </fieldset>
  </div>


  <div align="left" style="margin-top: 40px;" id="updateDiv">
    <fieldset style="width: 40%">
      <legend style="font-size: medium;">
        <h3>Update Profile</h3>
      </legend>
      <div align="Center">
        Phone Number : <input type="text" id="updatePhoneNo"> name : <input type="text" id="name">
      </div>
      <br />
      <div align="right">
        <input type="submit" value="Update" id="update" style="font-size: medium; width: 100px; height: 30px;"> <input type="reset" value="Clear" id="clearUpdate">
      </div>
    </fieldset>
  </div>

  <div align="left" style="margin-top: 40px;" id="findDiv">
    <fieldset style="width: 40%">
      <legend style="font-size: medium;">
        <h3>Find User(s)</h3>
      </legend>
      <div align="Center">
        Phone Number : <input type="text" id="findByPhoneNo"> <input type="submit" value="Get User" id="getUser">
      </div>
      <br />
      <div align="right">
        <input type="submit" value="Get All Users" id="getAllUser" style="font-size: medium; width: 110px; height: 30px;">
      </div>
      <br />
      <div align="left">
        <!-- <textarea rows="10" cols="100" id="users" readonly="readonly"></textarea> -->
        <table id="userTable">
          <thead>
            <tr>
              <th>Name</th>
              <th>Phone Number</th>
              <th>Country</th>
              <th>OTP</th>
              <th>GCM ID</th>
              <th>Active</th>
            </tr>
          </thead>
          <tbody id="userList"></tbody>
        </table>
      </div>
    </fieldset>
  </div>


</body>
</html>