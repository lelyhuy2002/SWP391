import React from 'react';
import './UserManagementHeader.css';

const UserManagementHeader = () => {
  return (
    <div className="container">
      {/* Header chứa tiêu đề bên trái và nút bên phải */}
      <div className="header-row">
        <div className="header-text">
          <h1 className="title">Quản lý người dùng</h1>
          <p className="subtitle">Quản lý tài khoản khách hàng</p>
        </div>
        <div className="top-right-buttons">
          <button className=" user-add-btn">Thêm người dùng mới</button>
        </div>
      </div>

      {/* Thanh tìm kiếm và lọc */}
      <div className="toolbar">
        <input
          type="text"
          className="search-input"
          placeholder="Tìm kiếm theo tên hoặc email..."
        />
        <select className="status-filter">
          <option value="all">Tất cả trạng thái</option>
          <option value="active">Đã xác thức</option>
          <option value="blocked">Chưa xác thức</option>
        </select>
      </div>
    </div>
  );
};

export default UserManagementHeader;
