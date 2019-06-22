package mmo.common;

import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import mmo.model.AccountModel;

public final class GenerateAccountHandle {

    public static final Random RANDOM = new Random();

    public GenerateAccountHandle() {
    }

    public static String getRandomPhoneNumber() {
        // MAX PAGE NUMBER = 9585 
        return DatasSource.PHONE_NUMBERS
                .get(RANDOM.nextInt(DatasSource.PHONE_NUMBERS.size()));
    }

    public static List<AccountModel> getListAccountRandom(int total) {
        List<AccountModel> accountModels = new LinkedList<>();
        for (int i = 0; i < total; i++) {
            accountModels.add(getAccountRandom());
        }
        return accountModels;
    }

    public static AccountModel getAccountRandom() {
        Map<Integer, String> listWords = DatasSource.LIST_WORDS;
        Integer id
                = Math.abs((RANDOM.nextInt(12345) + (int) ZonedDateTime.now().toInstant().toEpochMilli()) / 11);
        // random username from list word
        StringBuilder username = new StringBuilder();
        username
                .append(listWords.get(RANDOM.nextInt(listWords.size() - 1)))
                .append(listWords.get(RANDOM.nextInt(listWords.size())).substring(0, 3))
                .append(id.byteValue() / 2);
        String usr = username.toString();
        usr = (usr.length() > 15) ? usr.substring(0, 15) : usr;
        StringBuilder password = new StringBuilder();
        // random password
        password.append(listWords.get(RANDOM.nextInt(listWords.size())))
                .append(Calendar.getInstance().getTimeInMillis());
        // random phone
        String phone = getRandomPhoneNumber();
        return new AccountModel(id, usr, password.toString(), phone);
    }

}
