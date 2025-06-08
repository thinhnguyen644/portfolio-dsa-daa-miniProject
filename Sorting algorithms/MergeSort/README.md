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
![image](https://github.com/user-attachments/assets/db84cd15-32ab-48e8-b22a-07d7900416a2)

---

## 🎯 Analysis complexity

- Dựa vào pseudo code ta có thể tạo cost table như sau
  + MergeSort

  + Merge

- Theo Master theorem: T(n) = c + aT(n/b) + f(n)
  + c: số operations phụ trợ (hằng số --> không đáng kể)
  + a: số subproblem (số bài toán con) --> 2
  + n/b: số lượng input của subproblems --> n/2
  + f(n): độ phức tạp của merge function --> n
- Complexity: T(n) = 2T(n/2) + 
---

## 🛠 Công nghệ sử dụng

- 💻 java/javascript/python
- 📘 VS Code / Jupyter Notebook
- 📊 draw.io / Excalidraw (cho sơ đồ giải thuật)
- 🔖 Tài liệu tham khảo: CLRS, GeeksForGeeks, LeetCode, Hackerrank

---

## 📸 Hình minh họa

> Một số thư mục có thể chứa ảnh minh họa thuật toán, đồ thị phân tích hoặc video demo trong `images/` hoặc `docs/`.

---

## 📬 Liên hệ

- GitHub: [@nguyenhuuthinh](https://github.com/thinhnguyen644)
- Email: thinhnguyen49277@gmail.com
- LinkedIn: [linkedin.com/in/yourname](https://linkedin.com/in/yourname)

---

> *“Tư duy thuật toán tốt là nền tảng của kỹ sư phần mềm giỏi.”*  
> — Một sinh viên đang cố gắng mỗi ngày 💪

