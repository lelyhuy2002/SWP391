# SWP391 Project - Reproductive Health Consultation System

## Mô tả dự án
Hệ thống tư vấn sức khỏe sinh sản với các chức năng chính:
- Quản lý tư vấn viên
- Quản lý blog và bài viết
- Hệ thống đặt lịch tư vấn
- Quản lý người dùng
- Dashboard cho admin và manager

## Cấu trúc dự án
```
Swp391_Project1/
├── FESWP/                 # Frontend React
│   ├── src/
│   │   ├── components/    # React components
│   │   ├── pages/        # Page components
│   │   ├── context/      # React context
│   │   └── ...
│   ├── package.json
│   └── ...
└── Swp391_Project/       # Backend Spring Boot
    ├── src/
    │   ├── main/java/
    │   │   └── com/group1/project/swp_project/
    │   │       ├── controller/
    │   │       ├── service/
    │   │       ├── entity/
    │   │       └── ...
    │   └── resources/
    └── pom.xml
```

## Cài đặt và chạy

### Frontend (React)
```bash
cd FESWP
npm install
npm run dev
```

### Backend (Spring Boot)
```bash
cd Swp391_Project
mvn spring-boot:run
```

## Công nghệ sử dụng
- **Frontend**: React, Vite, Axios, React Router
- **Backend**: Spring Boot, JPA, MySQL
- **Authentication**: JWT
- **Styling**: CSS

## Tác giả
SWP391 Team 