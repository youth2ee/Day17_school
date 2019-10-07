package com.naver.point;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.naver.util.DBConnector;

public class PointDAO {
	//메인에서 아이디패스워드 입력받아오면 해당학생의 점수를 조회해온다.

	public PointDTO search(String id, String pw) {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs =null;
		PointDTO pointDTO =null;

		try {
			con=DBConnector.getConnect();

			String sql = "select * from point where num=(select num from member where id=? and pw=?)";

			st=con.prepareStatement(sql);
			st.setString(1, id);
			st.setString(2, pw);
			
			rs = st.executeQuery();
			
			if(rs.next()) {
				pointDTO = new PointDTO();
				pointDTO.setNum(rs.getInt(1));
				pointDTO.setName(rs.getString(2));
				pointDTO.setKor(rs.getInt(3));
				pointDTO.setEng(rs.getInt(4));
				pointDTO.setMath(rs.getInt(5));
				pointDTO.setTotal(rs.getInt(6));
				pointDTO.setAvg(rs.getDouble(7));
	
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return pointDTO;
	}

}
