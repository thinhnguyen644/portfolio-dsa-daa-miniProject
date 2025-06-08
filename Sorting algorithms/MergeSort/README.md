# 📘 MERGE SORT

Merge Sort là một thuật toán sắp xếp theo kiểu chia để trị (Divide and Conquer), được sử dụng rộng rãi vì độ ổn định và hiệu quả trong việc xử lý các tập dữ liệu lớn.

---

## 🧠 Mô phỏng Cách hoạt động

![image](https://github.com/user-attachments/assets/b1d0be81-9328-40a1-8df7-77e54b0d7d23)  

- Chia (Divide)  
  + Nếu mảng có nhiều hơn 1 phần tử, chia mảng thành 2 nửa gần bằng nhau.
  + Gọi đệ quy chính nó để tiếp tục chia nhỏ từng nửa cho đến khi còn các mảng con chỉ chứa 1 phần tử (mặc định đã được sắp xếp)
- Trị (Conquer)
  + Sắp xếp từng mảng con bằng cách gộp hai phần đã chia lại với nhau theo thứ tự tăng dần.
- Trộn (Merge)
  + Trộn các mảng con đã sắp xếp lại với nhau thành mảng lớn hơn, theo thứ tự đúng.

---

## 📘 Pseudo code

![image](https://github.com/user-attachments/assets/0fb47930-42a1-499e-bdaa-11734b5ad9ff)  
![image](https://github.com/user-attachments/assets/dd097631-c3fb-4bec-bfce-2b3827523ea2)

---

## 🎯 Analysis complexity

- Dựa vào pseudo code ta có thể tạo cost table như sau
  + Merge

| 📁 Line | 🧮 Cost | 📊 Loop |
|--------:|:-------:|:-------:|
|    1    |    4    |    1    |
|    2    |    2    |   < n   |
|    3    |    1    |   < n   |
|    4    |    1    |   < n   |
|    5    |    1    |   < n   |
|    6    |    1    |   < n   |
|    7    |    1    |   < n   |
|    8    |    1    |   < n   |
|    9    |    1    |   < n   |
|   10    |    2    |   < n   |
|   11    |    1    |   < n   |
|   12    |    1    |   < n   |
|   13    |    1    |   < n   |
|   14    |    1    |   < n   |
|   15    |    1    |   < n   |
|   16    |    1    |   < n   |
|   17    |    1    |   < n   |


==> complexity < 16n + 1 ==> O(n)

- Theo Master theorem: T(n) = c + aT(n/b) + f(n)
  + c: số operations phụ trợ (hằng số --> không đáng kể)
  + a: số subproblem (số bài toán con) --> 2
  + n/b: số lượng input của subproblems --> n/2
  + f(n): độ phức tạp của merge function --> để đơn giản, ta làm tròn thành n
- Complexity: T(n) = 2T(n/2) + n = 2*(2*T(n/2^2) + n) + n = ... = 2^k * T(n/2^k) + kn
- basecase là 1 ==> n/2^k = 1 ==> k = log2(n)
- Thay vào phương trình: T(n) = 2^(log2(n)) * T(1) + n*log2(n)
- Rút gọn phương trình: T(n) = n*1 + nlog2(n) <=> T(n) = n*(log2(n) + 1)
- Vậy độ phức tạp là: n*(log2(n) + 1) ==> O(nlogn)
![image](https://github.com/user-attachments/assets/6d3143e4-62af-42a0-820b-81096913d60e)

  
---

## 🛠 Triển khai code

![image](https://github.com/user-attachments/assets/993f22e0-3e38-4475-a5ac-d9d7866d0017)  
![image](https://github.com/user-attachments/assets/d80f6d4a-2224-42c2-abf9-df09dc2223c4)
![image](https://github.com/user-attachments/assets/2ded69f1-f900-4ebc-848d-4ddcd9c4cf71)

- kết quả:
![image](https://github.com/user-attachments/assets/3d00309f-0aeb-4049-8072-fb4ab4a85bdd)


---

## 📸 Unit test

![image](https://github.com/user-attachments/assets/1261c044-3f70-414d-b1c8-08ac4d6fe9b2)  

![image](https://github.com/user-attachments/assets/6dabd23b-ed81-478b-a945-5128421b2dd3)  

- Kết quả:
![image](https://github.com/user-attachments/assets/3d7621a7-fff5-4561-a31e-412805dae511)


---


