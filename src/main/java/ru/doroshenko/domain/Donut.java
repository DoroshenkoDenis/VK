package ru.doroshenko.domain;

public class Donut {
    private boolean isDonut; //запись доступна только платным подписчикам Donut
    private int paidDuration; //время, в течение которого запись будет доступна только платным подписчикам
    private Object placeholder; //заглушка для пользователей, которые не оформили платную подписку
    private boolean canPublishFreeCopy; //можно ли открыть запись для всех пользователей, а не только для оплаченных
    private String editMode; //информация о том, какие значения Donut можно изменить в записи

    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public Object getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(Object placeholder) {
        this.placeholder = placeholder;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
