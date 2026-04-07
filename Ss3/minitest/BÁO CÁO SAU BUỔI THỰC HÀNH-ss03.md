**BÁO CÁO SAU BUỔI THỰC HÀNH**

**Môn học:** Java Web (Spring MVC)\
**Tên buổi thực hành:** Mini-project – StudentHub\
**Thời gian thực hành:** 180 phút\
**Họ và tên sinh viên:** Đỗ Trí Công\
**Mã sinh viên:** PTIT-HN-103\
**Lớp:** HN-KS24-CNTT2  **Nhóm:** 1

**I. NỘI DUNG ĐÃ THỰC HÀNH**

**1. Trình bày các giải pháp**

Trong buổi thực hành, em đã xây dựng ứng dụng web **StudentHub – Hệ thống Quản lý Sinh viên** sử dụng **Spring MVC**. Hệ thống giúp hiển thị, tìm kiếm, sắp xếp và thống kê dữ liệu sinh viên một cách trực quan thay thế cho việc quản lý bằng file Excel.

**Giải pháp tổng thể**

Hệ thống được thiết kế theo kiến trúc **4 tầng chuẩn của Spring MVC**:

- **Configuration**: cấu hình DispatcherServlet, ViewResolver 
- **Controller**: xử lý request từ người dùng 
- **Service**: xử lý logic nghiệp vụ 
- **Repository**: lưu trữ dữ liệu (hardcoded List<Student>) 

**Các giải pháp kỹ thuật áp dụng**

- Sử dụng **Spring MVC** để điều hướng URL 
- Truyền dữ liệu qua **Query Parameter (URL)** 
- Hiển thị dữ liệu bằng **JSP + JSTL + EL** 
- Xử lý logic tại tầng **Service** 
- Sử dụng **List** để quản lý dữ liệu sinh viên 
- Áp dụng **Stream API** để lọc, sắp xếp và thống kê 

**2. Liệt kê các câu hỏi từ nhóm khác và câu hỏi phản biện**

- Vì sao dữ liệu được hardcoded trong Repository?\
  (Do yêu cầu bài học nhằm tập trung vào MVC, chưa cần database.) 
- Vì sao không xử lý logic ở Controller?\
  (Để đảm bảo đúng kiến trúc MVC, logic phải nằm ở Service.) 
- JSTL có vai trò gì?\
  (Giúp hiển thị dữ liệu động trên JSP dễ dàng hơn.) 
- Vì sao dùng Query Parameter để filter/sort?\
  (Để dễ dàng điều hướng và test trực tiếp trên URL.) 
- Nếu dữ liệu lớn thì List có còn phù hợp không?\
  (Không, khi đó cần dùng Database và Pagination.) 

**3. Thực hành triển khai code**

**a. Các nội dung lập trình đã sử dụng**

- Spring MVC (Controller, Model, View) 
- JSP, JSTL, Expression Language (EL) 
- Java Collections (List) 
- Stream API (filter, sort, average) 
- Điều hướng URL với @RequestMapping 
- Truyền dữ liệu qua Model 

**b. Cấu trúc chương trình gồm**

- **Configuration** 
  - WebConfig 
  - DispatcherServlet config 
- **Controller** 
  - StudentController 
- **Service** 
  - StudentService 
- **Repository** 
  - StudentRepository 
- **Model** 
  - Student 
- **View** 
  - students.jsp 
  - detail.jsp 
  - dashboard.jsp 



**c. Thao tác với hệ thống**

- Hiển thị danh sách sinh viên 
- Sắp xếp theo tên hoặc GPA 
- Tìm kiếm theo tên hoặc khoa 
- Xem chi tiết sinh viên 
- Thống kê tổng quan (Dashboard) 

**II. CÔNG VIỆC CÁC EM ĐÃ LÀM**

**1. Công việc cá nhân**

- Phân tích yêu cầu từ SRS 
- Thiết kế model Student 
- Tạo dữ liệu mẫu trong Repository 
- Viết Controller xử lý request 
- Xây dựng Service xử lý logic 
- Thiết kế giao diện JSP 
- Test các chức năng filter/sort 
- Debug lỗi hiển thị JSTL 

**2. Công việc nhóm**

- Thảo luận kiến trúc hệ thống 
- Phân chia module (Controller, View, Service) 
- Kiểm tra dữ liệu hiển thị 
- Hỗ trợ debug lỗi 
- Góp ý cải thiện giao diện 

**III. KẾT QUẢ CÁC EM ĐẠT ĐƯỢC**

Sau buổi thực hành, em đã:

1. Hiểu rõ kiến trúc Spring MVC 
1. Biết cách điều hướng URL và truyền dữ liệu 
1. Sử dụng thành thạo JSTL và EL 
1. Áp dụng đúng mô hình phân tầng 
1. Xây dựng được hệ thống quản lý sinh viên cơ bản 
1. Thực hiện được các chức năng filter, sort và thống kê 

**IV. KHÓ KHĂN VÀ VẤN ĐỀ CÁC EM GẶP PHẢI**

**1. Các khó khăn**

1. Lỗi mapping URL trong Controller 
1. Lỗi không hiển thị dữ liệu JSP 
1. Sai cú pháp JSTL 
1. Khó xử lý logic filter + sort cùng lúc 
1. Lỗi encoding tiếng Việt 

**2. Cách khắc phục**

- Kiểm tra lại @RequestMapping 
- Cấu hình ViewResolver đúng 
- Sử dụng đúng tag JSTL 
- Tách logic xử lý tại Service 
- Thiết lập UTF-8 cho project 

**V. KINH NGHIỆM RÚT RA**

**1. Kinh nghiệm từ bài thực hành**

- Luôn tuân thủ mô hình MVC 
- Không viết logic trong JSP 
- Service là nơi xử lý chính 
- Test từng chức năng nhỏ 
- Viết code rõ ràng, dễ hiểu 

**2. Lưu ý cho các buổi thực hành sau**

- Tách module rõ ràng 
- Đặt tên URL hợp lý 
- Validate dữ liệu đầu vào 
- Tối ưu giao diện JSP 
- Chuẩn bị dữ liệu test đầy đủ 

**VI. ĐỀ XUẤT / KIẾN NGHỊ**

Em đề xuất giảng viên bổ sung thêm:

- Bài tập tích hợp **Spring MVC với Database (JDBC/Hibernate)** 
- Hướng dẫn sử dụng **Spring Boot** để tối ưu cấu hình 
- Các bài tập nâng cao về **REST API** 

Điều này giúp sinh viên tiếp cận gần hơn với thực tế phát triển web.

**VII. KẾT LUẬN**

Qua buổi thực hành mini-project **StudentHub**, em đã nắm vững các kiến thức:

- Kiến trúc Spring MVC 
- Xử lý request/response 
- Hiển thị dữ liệu với JSP + JSTL 
- Phân tầng ứng dụng rõ ràng 

Buổi thực hành giúp em xây dựng nền tảng vững chắc để phát triển các ứng dụng web phức tạp hơn trong tương lai.

