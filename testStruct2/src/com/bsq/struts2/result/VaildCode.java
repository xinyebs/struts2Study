package com.bsq.struts2.result;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.nio.Buffer;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.Servlet;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;

/**
 * 产生二维码  自定义结果视图
 * 
 * @author chfs-bsq
 *
 */
public class VaildCode implements Result {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int width = 120;

	private int height = 25;

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void execute(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub

		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		Graphics g = image.getGraphics();
		g.setColor(Color.blue);
		g.drawRect(0, 0, width, height);
		g.setColor(Color.YELLOW);
		g.fillRect(1, 1, width - 2, height - 2);
		g.setColor(Color.GRAY);

		Random r = new Random();

		for (int i = 0; i < 10; i++) {

			g.drawLine(r.nextInt(width), r.nextInt(height), r.nextInt(width), r.nextInt(height));

			g.setColor(Color.RED);

			g.setFont(new Font("宋体", Font.BOLD, 18));

		}

		ImageIO.write(image, "jpg", ServletActionContext.getResponse().getOutputStream());

	}

}
