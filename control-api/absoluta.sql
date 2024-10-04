CREATE TABLE flavours(
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	updated_at TIMESTAMP DEFAULT NULL
);

CREATE TABLE product_categories(
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	updated_at TIMESTAMP DEFAULT NULL
);

CREATE TABLE product_sizes(
	id SERIAL PRIMARY KEY,
	name VARCHAR(40) NOT NULL,
	created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	updated_at TIMESTAMP DEFAULT NULL
);

CREATE TABLE products(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255) NOT NULL,
	price NUMERIC NOT NULL,
	description VARCHAR(255),
	isActive BOOLEAN DEFAULT TRUE,
	stockAmount INT DEFAULT 0,
	flavour_id INT NOT NULL,
	category_id INT NOT NULL,
	size_id INT NOT NULL,
	created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	updated_at TIMESTAMP DEFAULT NULL,
	FOREIGN KEY (flavour_id) REFERENCES flavours (id),
	FOREIGN KEY (category_id) REFERENCES product_categories (id),
	FOREIGN KEY (size_id) REFERENCES product_sizes (id)
);

CREATE TABLE payment_types(
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	updated_at TIMESTAMP DEFAULT NULL
);

CREATE TABLE marketplace_types(
	id SERIAL PRIMARY KEY,
	name VARCHAR(40) NOT NULL,
	created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	updated_at TIMESTAMP DEFAULT NULL
);

CREATE TABLE marketplaces(
	id SERIAL PRIMARY KEY,
	name VARCHAR(80) NOT NULL,
	location VARCHAR(255),
	type_id INT NOT NULL,
	created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	updated_at TIMESTAMP DEFAULT NULL,
	FOREIGN KEY (type_id) REFERENCES marketplace_types (id)
);

CREATE TABLE orders(
	id SERIAL PRIMARY KEY,
	amount INT DEFAULT 0,
	sub_total NUMERIC DEFAULT 0.0,
	discount NUMERIC DEFAULT 0.0,
	total NUMERIC DEFAULT 0.0,
	marketplace_id INT NOT NULL,
	payment_type_id INT NOT NULL,
	created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	updated_at TIMESTAMP DEFAULT NULL,
	FOREIGN KEY (marketplace_id) REFERENCES marketplaces (id),
	FOREIGN KEY (payment_type_id) REFERENCES payment_types (id)
);

CREATE TABLE orders_products(
	order_id INT NOT NULL,
	product_id INT NOT NULL,
	product_amount INT,
	created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
	updated_at TIMESTAMP DEFAULT NULL,
	PRIMARY KEY (order_id, product_id),
	FOREIGN KEY (order_id) REFERENCES orders (id),
	FOREIGN KEY (product_id) REFERENCES products (id)
);

CREATE OR REPLACE FUNCTION update_modified_column()
	RETURNS TRIGGER AS $$
	BEGIN NEW.updated_at = clock_timestamp();
	RETURN NEW;
	END;
$$ language 'plpgsql';

CREATE TRIGGER update_modified_time BEFORE UPDATE ON flavours FOR EACH ROW EXECUTE PROCEDURE update_modified_column();
CREATE TRIGGER update_modified_time BEFORE UPDATE ON product_categories FOR EACH ROW EXECUTE PROCEDURE update_modified_column();
CREATE TRIGGER update_modified_time BEFORE UPDATE ON product_sizes FOR EACH ROW EXECUTE PROCEDURE update_modified_column();
CREATE TRIGGER update_modified_time BEFORE UPDATE ON products FOR EACH ROW EXECUTE PROCEDURE update_modified_column();
CREATE TRIGGER update_modified_time BEFORE UPDATE ON payment_types FOR EACH ROW EXECUTE PROCEDURE update_modified_column();
CREATE TRIGGER update_modified_time BEFORE UPDATE ON marketplace_types FOR EACH ROW EXECUTE PROCEDURE update_modified_column();
CREATE TRIGGER update_modified_time BEFORE UPDATE ON marketplaces FOR EACH ROW EXECUTE PROCEDURE update_modified_column();
CREATE TRIGGER update_modified_time BEFORE UPDATE ON orders FOR EACH ROW EXECUTE PROCEDURE update_modified_column();
CREATE TRIGGER update_modified_time BEFORE UPDATE ON orders_products FOR EACH ROW EXECUTE PROCEDURE update_modified_column();