<?php
	require "connect.php";
	$query = "SELECT QuangCao.IdQuangCao, QuangCao.NoiDung, QuangCao.HinhAnh, QuangCao.IdBaiHat, BaiHat.TenBaiHat, BaiHat.HinhAnhBaiHat FROM QuangCao JOIN BaiHat ON QuangCao.IdBaiHat = BaiHat.IdBaiHat ";
	$data = mysqli_query($con, $query);

	class QuangCao{
		function QuangCao($IdQuangCao, $NoiDung, $HinhAnhQuangCao, $IdBaiHat, $TenBaiHat, $HinhAnhBaiHat){
			$this->IdQuangCao = $IdQuangCao;
			$this->NoiDung = $NoiDung;
			$this->HinhAnhQuangCao = $HinhAnhQuangCao;
			$this->IdBaiHat = $IdBaiHat;
			$this->TenBaiHat = $TenBaiHat;
			$this->HinhAnhBaiHat = $HinhAnhBaiHat;
		}
	}
	
	$arrayQuangCao = array();
	while($row = mysqli_fetch_assoc($data)){
		array_push($arrayQuangCao, new QuangCao($row['IdQuangCao']
												,$row['NoiDung']
												,$row['HinhAnh']
												,$row['IdBaiHat']
												,$row['TenBaiHat']
												,$row['HinhAnhBaiHat']));
												 
	}
	
	echo json_encode($arrayQuangCao);
?>