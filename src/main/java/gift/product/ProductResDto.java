package gift.product;

public record ProductResDto(
        Long id,
        String name,
        Integer price,
        String imageUrl
) {
    public ProductResDto(Product product) {
        this(product.getId(), product.getName(), product.getPrice(), product.getImageUrl());
    }
}