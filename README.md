# HybridPedestal

**HybridPedestal** là plugin Minecraft cho **Paper API**, cho phép bạn tạo **pedestals trưng bày vật phẩm** với cơ chế **chế tạo trực tiếp và hiệu ứng tùy chỉnh**. Plugin hoạt động với **Minecraft 1.21.1 → 1.21.4** và yêu cầu **Java 21**.

---

## Tính năng

* **Trưng bày vật phẩm**: Đặt item lên pedestal dưới dạng hologram.
* **Chế tạo trực tiếp trên pedestal**: Click để nhận item nếu đủ nguyên liệu.
* **Hiệu ứng tùy chỉnh**: Particle hoặc hiệu ứng đặc biệt khi chế tạo thành công.
* **Cấu hình dễ dàng**: `config.yml` và `messages.yml` dễ chỉnh sửa.
* **Tương thích nhiều phiên bản Paper**: 1.21.1 → 1.21.4.

---

## Yêu cầu

* **Server**: Paper 1.21.1 → 1.21.4
* **Java**: 21
* **Maven**: dùng để build plugin

---

## Cài đặt

1. Tải **HybridPedestal.jar**.
2. Đặt vào thư mục `plugins` của server Paper.
3. Khởi động server để tạo các file cấu hình:

```
plugins/
├── HybridPedestal.jar
└── HybridPedestal/
    ├── config.yml
    └── messages.yml
```

4. Chỉnh sửa `config.yml` để tùy biến pedestal, vật phẩm và hiệu ứng.
5. Reload server hoặc plugin để áp dụng cấu hình mới.

---

## Cấu hình

**config.yml** mẫu:

```yaml
pedestals:
  pedestal1:
    item: DIAMOND_SWORD
    recipe:
      - "DIAMOND, DIAMOND, STICK"
    effect: PARTICLE_FLAME
  pedestal2:
    item: GOLDEN_APPLE
    recipe:
      - "GOLD_INGOT, GOLD_INGOT, APPLE"
    effect: PARTICLE_HEART
```

**messages.yml** mẫu:

```yaml
not-enough-materials: "Bạn chưa đủ nguyên liệu để chế tạo vật phẩm này."
craft-success: "Chúc mừng! Bạn đã chế tạo thành công %item%."
```

---

## Lệnh

* `/hybridpedestal reload` – Reload cấu hình plugin.
* `/hybridpedestal give <player> <pedestal>` – Gửi vật phẩm từ pedestal cho người chơi (admin only).

---

## Hướng dẫn sử dụng

1. Tạo pedestal trong `config.yml`.
2. Chọn item và recipe chế tạo.
3. Khi người chơi click vào pedestal:

   * Kiểm tra nguyên liệu
   * Hiển thị hiệu ứng
   * Gửi item vào inventory nếu đủ nguyên liệu

---

## Tương thích

* **Paper 1.21.1 → 1.21.4**
* Hợp tác với plugin hologram khác nếu không xung đột entity.

---

## Tác giả

* **Hybrid Team** (hoặc tên bạn muốn: Hybrid)

---

## Giấy phép

* MIT License (hoặc tùy chỉnh nếu muốn hạn chế phân phối)
